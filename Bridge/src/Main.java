public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testSmartDevice(new SmartTv());
    }

    public static void testDevice(Device device) {
        System.out.println("\n=== Testing basic devices ===");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.mute();
        device.printStatus();
    }

    public static void testSmartDevice(SmartTv smartTv) {
        System.out.println("\n=== Testing Smart TV ===");
        SmartRemote smartRemote = new SmartRemote(smartTv);
        smartRemote.power();
        smartRemote.voiceControl("mute");
        smartTv.browseInternet();
        smartRemote.voiceControl("power off");
        smartTv.printStatus();
    }
}
