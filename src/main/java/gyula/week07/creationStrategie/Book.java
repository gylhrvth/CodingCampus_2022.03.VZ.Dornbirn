package gyula.week07.creationStrategie;

public class Book {
    private String autor;
    private String title;

    public Book(String autor, String title){
        this.autor = autor;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
