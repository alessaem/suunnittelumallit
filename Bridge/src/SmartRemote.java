public class SmartRemote extends AdvancedRemote{

    public SmartRemote(Device device){
        super(device);
    }

    public void voiceControl(String command){
        System.out.println("Voice control command: " + command);
        if("mute".equals(command.toLowerCase())){
            device.setVolume(0);
        }else if("unmute".equals(command.toLowerCase())){
            device.setVolume(30);
        }else if("power off".equals(command.toLowerCase())){
            device.disable();
        }
    }
}
