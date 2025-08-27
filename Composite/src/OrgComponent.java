public abstract class OrgComponent {
    protected String name;


    public OrgComponent(String name) {
        this.name = name;
    }

    public abstract void add(OrgComponent component);

    public abstract void remove(OrgComponent component);

    public abstract OrgComponent getChild(int index);

    public abstract double getSalary();

    public abstract void printXML();
}
