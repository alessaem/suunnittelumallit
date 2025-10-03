public interface IChatMediator {
    void registerClient(ChatClientController client);
    void sendMessage(String from, String to, String message);
    void updateAllRecipients();

}
