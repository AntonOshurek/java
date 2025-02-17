public class Main {
    public static void main(String[] args) {

        Document doc = new Document("doc title", "11-22-33", "Anton Oshurek");

        String json = doc.getJson();

        System.out.println(json);
    }
}