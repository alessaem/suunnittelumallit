public class ButtonA extends Button {
    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        String lines = "-".repeat(text.length()+2);
        System.out.println("+"+lines+"+");
        System.out.println("│ " + text + " │");
        System.out.println("+"+lines+"+");
    }
}
