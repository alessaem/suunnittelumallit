public interface IChatClient {
    String getUsername();
    void sendMessage(String to, String message);
    void receiveMessage(String from, String message);
    void updateRecipients(Iterable<String> usernames);

}
