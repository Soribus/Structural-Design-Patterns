
/**
 *
 * @author Jacqueline Kuch
 */
public class AdvancedRemoteControl extends BasicRemoteControl {
    
    public AdvancedRemoteControl(Device device) {
        //super(device);
        
        super.device = device;
    }
    
    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
    
    public void setChannel(int channel) {
        System.out.println("Remote: set channel");
        device.setChannel(channel);
    }
}
