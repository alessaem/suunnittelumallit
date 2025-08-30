public class EncryptedPrinter extends PrinterDecorator{
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message){
        String encrypted = encrypt(message);
        super.print(encrypted);
    }

    public String encrypt(String message){
        String encryptedMessage = "";

        for(int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);
            if(Character.isLetter(ch)){
                encryptedMessage += (char)(ch+3);
            }else {
                encryptedMessage += ch;
            }
        }
        return encryptedMessage;
    }
}
