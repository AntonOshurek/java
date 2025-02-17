import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Document doc) {
        return "{"
                + "\"title\":\"" + escapeString(doc.title) + "\","
                + "\"author\":\"" + escapeString(doc.author) + "\","
                + "\"docId\":" + doc.docId + ","
                + "}";
    }

    private static String escapeString(String str) {
        return str.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    public static String getJsonFromDoc(Document doc) {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = doc.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (!first) {
                    json.append(",");
                }
                json.append("\"").append(field.getName()).append("\":");

                Object value = field.get(doc);
                if (value instanceof String) {
                    json.append("\"").append(escapeString((String) value)).append("\"");
                } else {
                    json.append(value);
                }
                first = false;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.append("}");
        return json.toString();
    }
}
