package gyula.week07.creationStrategie;

import java.util.Vector;

public class Shelf {
    private String label;
    private int length;
    private Vector<Book> books;
    private Vector<Vase> vases;
    private Vector<Picture> pictures;

    public Shelf(String label, int length){
        this.label = label;
        this.length = length;
        books = new Vector<>();
        vases = new Vector<>();
        pictures = new Vector<>();
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "label='" + label + '\'' +
                ", length=" + length +
                ", \nbooks=" + books +
                ", \nvases=" + vases +
                ", \npictures=" + pictures +
                '}';
    }

    public void addBook(Book b){
        books.add(b);
    }

    public void addVase(Vase v){
        vases.add(v);
    }

    public Picture addPicture(int year, String description, String persons){
        Picture p = new Picture(year, description, persons);
        pictures.add(p);
        return p;
    }
}


