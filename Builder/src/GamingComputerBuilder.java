public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor(){
        computer.setProcessor("Intel Core Ultra 9 285HX");
    }

    @Override
    public void buildRam(){
        computer.setRam(64);
    }

    @Override
    public void buildHardDrive(){
        computer.setHardDrive("6 TB SSD");
    }

    @Override
    public void buildGraphicsCard(){
        computer.setGraphicsCard("NVIDIA GeForce RTX 5080");
    }

    @Override
    public void buildOperatingSystem(){
        computer.setOperatingSystem("Windows 11 Pro");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
