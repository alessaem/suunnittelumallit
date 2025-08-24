public class Main {
    public static void main(String[] args) {
        UIFactory uiFactory = new AFactory();
        Button button = uiFactory.createButton("Btn1");
        button.display();
        button.setText("btn1v2");
        button.display();
        TextField textField = uiFactory.createTextField("This is a TextField");
        textField.display();
        CheckBox checkBox = uiFactory.createCheckBox("checkiboxi", true);
        checkBox.display();
        checkBox.setSelected(false);
        checkBox.display();
    }
}
