public class Main {
    public static void main(String[] args) {
        OrgComponent organization = new Organization("Organization");

        OrgComponent department1 = new Department("Department1");
        OrgComponent department2 = new Department("Department2");
        OrgComponent department3 = new Department("Department3");

        OrgComponent employee1 = new Employee("Pekka",1500);
        OrgComponent employee2 = new Employee("Sirkka",3000);
        OrgComponent employee3 = new Employee("Mirva",4000);
        OrgComponent employee4 = new Employee("Jukka",1000);
        OrgComponent employee5 = new Employee("Sini",2000);

        department1.add(employee1);
        department1.add(employee2);
        department2.add(employee3);
        department2.add(employee4);
        department3.add(employee5);

        organization.add(department1);
        organization.add(department2);
        department2.add(department3);

        organization.printXML();
        System.out.println(organization.getSalary());

    }
}
