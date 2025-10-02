import java.util.ArrayList;
import java.util.List;

public class Recommendation {
    private String targetAudience;
    private List<Book> books = new ArrayList<>();

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        boolean found = false;
        for (Book b : books) {
            if (b.getAuthor().equals(book.getAuthor()) && b.getTitle().equals(book.getTitle())) {
                books.remove(b);
                found = true;
            }
        }
        if(!found) {
            System.out.println("No book match found so no book was deleted");

        }
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Recommendation clone() {
        Recommendation copy = new Recommendation(this.targetAudience);

        for (Book book : this.books) {
            copy.addBook(book.clone());
        }

        return copy;
    }
}
