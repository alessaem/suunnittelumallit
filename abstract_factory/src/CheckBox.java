public abstract class CheckBox {
    protected String text;
    protected boolean isSelected;

    public CheckBox(String text,boolean isSelected) {
        this.text = text;
        this.isSelected = isSelected;
    }
    public abstract void display();

    public void  setText(String text) {
        this.text = text;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
}
