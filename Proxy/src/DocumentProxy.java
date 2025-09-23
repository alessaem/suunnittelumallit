import java.nio.file.AccessDeniedException;
import java.time.LocalTime;
import java.util.UUID;

public class DocumentProxy implements IDocument{

    private Document realDocument;

    public DocumentProxy(Document document) {
        this.realDocument = document;
    }

    @Override
    public UUID getId() {
        return realDocument.getId();
    }

    @Override
    public LocalTime getCreated() {
        return realDocument.getCreated();
    }

    @Override
    public String getContent(User user){
        if(AccessControlService.getInstance().isAllowed(realDocument.getId(),user.getUsername())){
            return realDocument.getContent(user);
        }else{
            throw new DocumentAccessDeniedException("Access Denied for user: "+user.getUsername());
        }
    }

}
