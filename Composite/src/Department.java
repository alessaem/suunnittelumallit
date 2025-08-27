import java.util.*;

public class Department extends OrgComponent {

    private List<OrgComponent> children =  new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void printXML() {
        System.out.println("<"+this.name+">");

        for (OrgComponent child : children) {
            child.printXML();
        }
        System.out.println("</"+this.name+">");
    }

    @Override
    public void add(OrgComponent component) {
        this.children.add(component);
    }

    @Override
    public void remove(OrgComponent component) {
        this.children.remove(component);
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (OrgComponent c : children) {
            total += c.getSalary();
        }
        return total;
    }

    @Override
    public OrgComponent getChild(int index){
        return this.children.get(index);
    }

}
