import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> elements =  new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    public void accept(FileSystemVisitor visitor) {
        for (FileSystemElement element : elements) {
            element.accept(visitor);
        }
    }
}
