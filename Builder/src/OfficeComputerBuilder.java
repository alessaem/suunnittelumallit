public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor(){
        computer.setProcessor("8-core Apple M4");
    }

    @Override
    public void buildRam(){
        computer.setRam(16);
    }

    @Override
    public void buildHardDrive(){
        computer.setHardDrive("512 GB SSD");
    }

    @Override
    public void buildGraphicsCard(){
        computer.setGraphicsCard("10-core Apple Integrated Graphics");
    }

    @Override
    public void buildOperatingSystem(){
        computer.setOperatingSystem("macOS");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }


}
