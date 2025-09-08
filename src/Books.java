public class Books {
    private String title;
    private String author;

    public Books(String title, String author){
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author ;
    }
}
