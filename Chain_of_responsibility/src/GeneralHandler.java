public class GeneralHandler extends Handler{

    @Override
    public void process(Message message) {
        if(message.getType()==MessageType.GENERAL) {
            System.out.println("General feedback received, we will contact you if needed!");
        }else{
            super.process(message);
        }
    }
}
