public class CheckBoxA extends CheckBox {
    public CheckBoxA(String text,boolean isSelected) {
        super(text,isSelected);
    }

    @Override
    public void display(){
        String check = isSelected ? "[*]" : "[ ]";
        String line = "-".repeat(text.length()+6);
        System.out.println("+" + line+ "+");
        System.out.println("│ " + check + " " + text + " │");
        System.out.println("+" + line+ "+");
    }
}
