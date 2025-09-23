public interface FileSystemElement {
    public String getName();
    public void accept(FileSystemVisitor visitor);
}
