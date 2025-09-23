public class Main {
    public static void main(String[] args) {
        FileSystemElement file1 = new File("file1",10);
        FileSystemElement file2 = new File("file2",15);
        FileSystemElement file3 = new File("file3",20);
        FileSystemElement file4 = new File("file4",100);
        FileSystemElement file5 = new File("file5",150);

        Directory directory1 = new Directory("Directory1");
        Directory directory2 = new Directory("Directory2");

        directory1.addElement(file1);
        directory1.addElement(file2);
        directory1.addElement(file3);

        directory2.addElement(file4);
        directory2.addElement(file5);

        Directory root = new Directory("root");
        root.addElement(directory1);
        root.addElement(directory2);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        SearchVisitor searchVisitor = new SearchVisitor("file");

        root.accept(sizeVisitor);
        root.accept(searchVisitor);

        System.out.println("Total size of all files: " + sizeVisitor.getTotalSize() + " MB");

        System.out.println("Files matching search term 'file':");
        for (File f : searchVisitor.getMatchingFiles()) {
            System.out.println(f.getName() + " (" + f.getSize() + " MB)");
        }

    }
}
