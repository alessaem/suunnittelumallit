public class Main {
    public static void main(String[] args) {
        Handler compensation = new CompensationHandler();
        Handler contact = new ContactHandler();
        Handler suggestion = new SuggestionHandler();
        Handler general = new GeneralHandler();

        compensation.setNextHandler(contact);
        contact.setNextHandler(suggestion);
        suggestion.setNextHandler(general);

        Message msg1 = new Message(MessageType.COMPENSATION,"Haluan rahaa","karhu@moi.fi");
        Message msg2 = new Message(MessageType.GENERAL,"Siisteyden taso ei hyvä","karhu@moi.fi");

        compensation.process(msg1);
        compensation.process(msg2);
    }
}
