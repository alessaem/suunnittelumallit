public class CompensationHandler extends Handler {


    @Override
    public void process(Message message) {
        if(message.getType()==MessageType.COMPENSATION) {
            System.out.println("Compensation claim from "+ message.getSenderEmail()+" is being reviewed...");
        }else{
            System.out.println("CompensationHandler: cant handle, sending to next handler");
            super.process(message);
        }
    }
}
