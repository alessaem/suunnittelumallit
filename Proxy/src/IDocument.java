import java.time.LocalTime;
import java.util.UUID;

public interface IDocument {
    public UUID getId();
    public LocalTime getCreated();
    public String getContent(User user);
}
