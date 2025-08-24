public class TextFieldA extends TextField {
    public TextFieldA(String text) {
        super(text);
    }

    @Override
    public void display(){
        String lines = "-".repeat(text.length()+4);
        System.out.println("+" + lines + "+");
        System.out.println("│  " + text + "  │");
        System.out.println("+" + lines + "+");
    }
}
