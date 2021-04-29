
/**
 *
 * @author Jacqueline Kuch
 */
public class Client {

    public static void main(String[] args) {
        testDevice(new Tv());
        //testDevice(new Radio());    
    }
    
    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemoteControl basicRemote = new BasicRemoteControl(device);
        basicRemote.togglePower();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(device);
        advancedRemote.togglePower();
        advancedRemote.mute();
        device.printStatus();
    }
    
    
}
