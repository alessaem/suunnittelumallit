import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class ChatMediator implements IChatMediator {
    private Map<String, IChatClient> clients = new HashMap<>();
    @Override
    public void registerClient(ChatClientController client) {
        clients.put(client.getUsername(), client);
    }

    @Override
    public void sendMessage(String from, String to, String message) {
        IChatClient recipient = clients.get(to);
        if (recipient != null) {
            recipient.receiveMessage(from, message);
        }
    }

    public void updateAllRecipients() {
        List<String> usernames = new ArrayList<>(clients.keySet());
        for (IChatClient client : clients.values()) {
            client.updateRecipients(usernames);
        }
    }


}
