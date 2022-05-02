package sergej.week07;


public class Book {
    private String title;
    private String content;
    private int pages;

    public Book(String title, String content, int pages) {
        this.title = title;
        this.content = content;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Title: "+title + " (Page size: " + pages + ") content: "+content;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }
}
