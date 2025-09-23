import java.util.HashMap;
import java.util.UUID;

public class Library {
    HashMap<UUID,IDocument> documents =  new HashMap<>();
    public Library(){}

    public UUID addDocument(String content){
        IDocument doc = new Document(content);
        documents.put(doc.getId(),doc);
        return doc.getId();
    }

    public UUID addProtectedDocument(String content){
        IDocument doc = new DocumentProxy(new Document(content));
        documents.put(doc.getId(),doc);
        return doc.getId();
    }

    public IDocument getDocument(UUID id){
        return documents.get(id);
    }
}
