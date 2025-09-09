public class SuggestionHandler extends Handler {

    @Override
    public void process(Message message) {
        if(message.getType()==MessageType.SUGGESTION) {
            System.out.println("Suggestion received and logged!");
        }else{
            System.out.println("SuggestionHandler: cant handle, sending to next handler");

            super.process(message);
        }
    }
}
