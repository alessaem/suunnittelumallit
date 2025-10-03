public class ChatClientController implements IChatClient {
    private String username;
    private ChatMediator mediator;
    private ChatClientView view;

    public ChatClientController(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
        this.view = new ChatClientView(this);
        mediator.registerClient(this);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void sendMessage(String to, String message) {
        mediator.sendMessage(username, to, message);
    }

    @Override
    public void receiveMessage(String from, String message) {
        view.appendMessage(from + ": " + message);
    }

    @Override
    public void updateRecipients(Iterable<String> usernames) {
        view.updateRecipients(usernames);
    }

    public void show() {
        view.show();
    }
}
