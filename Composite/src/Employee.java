public class Employee extends OrgComponent {
    private double salary;

    public Employee(String name,double salary){
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public void printXML() {
        System.out.println("<employee>");
        System.out.println("    <name>"+name+"</name>");
        System.out.println("    <salary>"+salary+"</salary>");
        System.out.println("</employee>");
    }

    @Override
    public void add(OrgComponent component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(OrgComponent component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public OrgComponent getChild(int index) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }
}
