public class Computer {
    private String processor;
    private Integer ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Processor: " + processor + "\n");
        str.append("RAM: " + ram + " GB"+"\n");
        str.append("Hard Drive: " + hardDrive + "\n");
        str.append("Graphics Card: " + graphicsCard + "\n");
        str.append("Operating System: " + operatingSystem + "\n");
        return str.toString();
    }

}
