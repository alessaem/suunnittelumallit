public class SmartTv extends Tv {

    public SmartTv() {}

    public void browseInternet(){
        System.out.println("Browsing Internet");
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a smart tv !!!!.");
        System.out.println("| I'm " + (super.isEnabled() ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + super.getVolume() + "%");
        System.out.println("| Current channel is " + super.getChannel() );
        System.out.println("------------------------------------\n");
    }
}
