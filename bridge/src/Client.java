
/**
 *
 * @author Jacqueline Kuch
 */
public class Client {

    public static void main(String[] args) {
        //todo: test one TV and Radio
    }
    
    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemoteControl basicRemote = new BasicRemoteControl();
        basicRemote.togglePower();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl();
        //advancedRemote.togglePower();
        advancedRemote.mute();
        advancedRemote.setChannel(5);
        device.printStatus();
    }
    
    
}
