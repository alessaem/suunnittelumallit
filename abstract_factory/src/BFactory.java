public class BFactory extends UIFactory {
    @Override
    public Button createButton(String text){
        return new ButtonB(text);
    }

    @Override
    public TextField createTextField(String text){
        return new TextFieldB(text);
    }

    @Override
    public CheckBox createCheckBox(String text,boolean selected){
        return new CheckBoxB(text, selected);
    }
}
