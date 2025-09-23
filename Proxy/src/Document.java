
import java.time.LocalTime;
import java.util.UUID;

public class Document implements IDocument{
    private UUID id;
    private LocalTime created;
    private String content;

    public Document(String content) {
        this.id = UUID.randomUUID();
        this.created = LocalTime.now();
        this.content = content;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public LocalTime getCreated() {
        return created;
    }

    @Override
    public String getContent(User user) {
        return content;
    }
}
