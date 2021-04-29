
/**
 *
 * @author Jacqueline Kuch
 */
public class Radio implements Device {

    private boolean on = false;
    private int volume = 20;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        //Radio specific code for on
        on = true;
    }

    @Override
    public void disable() {
        //Radio specific code for off
        on = false;
    }

    @Override
    public int getVolume() {
        //Radio specific code for volume
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        //Radio specific code for volume
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
