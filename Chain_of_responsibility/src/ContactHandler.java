public class ContactHandler extends Handler {

    @Override
    public void process(Message message) {
        if(message.getType()==MessageType.CONTACT) {
            System.out.println("Contact request being forwarded to right department");
        }else{
            System.out.println("ContactHandler: cant handle, sending to next handler");

            super.process(message);
        }
    }
}
