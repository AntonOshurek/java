public class Document {
    String title;
    String docId;
    String author;

    public Document(String title, String docId, String author) {
        this.title = title;
        this.docId = docId;
        this.author = author;
    }

    public String getJson() {
        return JsonConverter.getJsonFromDoc(this);
    }
}
