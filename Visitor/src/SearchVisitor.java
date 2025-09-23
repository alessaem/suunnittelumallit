import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private List<File> matchingFiles =  new ArrayList<>();
    private String name;

    public SearchVisitor(String name){
        this.name = name;
    }

    @Override
    public void visit(File file){
        if(file.getName().contains(name)){
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory){

    }

    public List<File> getMatchingFiles(){
        return matchingFiles;
    }
}
