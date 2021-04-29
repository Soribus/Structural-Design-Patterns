
/**
 *
 * @author Jacqueline Kuch
 */
public class BasicRemoteControl implements RemoteControl {

    //todo: create device reference object and adapt constructor
    
    public BasicRemoteControl() {}

    @Override
    public void togglePower() {
        System.out.println("Remote: power toggle");
        //todo: enable/disable device
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        //todo: decrease device volume
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        //todo: increase device volume
    }
    
    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        //todo: decrease channel by one
    }
    
    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        //todo: increase channel by one
    }
}
