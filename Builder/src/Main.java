public class Main {
    public static void main(String[] args) {
        //ComputerBuilder builder = new GamingComputerBuilder();
        ComputerBuilder builder = new OfficeComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.buildComputer();
        Computer computer = builder.getComputer();
        System.out.println(computer);
    }
}
