public class CheckBoxB extends CheckBox {

    public CheckBoxB(String text,boolean isSelected) {
        super(text,isSelected);
    }
    @Override
    public void display(){
        String check = isSelected ? "[x]" : "[ ]";
        String line = "─".repeat(text.length()+6);
        System.out.println("╭" + line+ "╮");
        System.out.println("│ " + check + " " + text + " │");
        System.out.println("╰" + line+ "╯");
    }
}
