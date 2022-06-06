public class TV {

    private int channel = 1;
    private int volumeLevel = 1;
    private boolean isOn = false;

    private static int numberOfTv = 0;

    public TV() {
        numberOfTv++;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void setChannel(int newChannel) {
        if (this.isOn == true && newChannel >= 1 && newChannel <= 120) {
            this.channel = newChannel;
        }
    }

    public void setVolume(int volumeLevel) {
        if (this.isOn == true && volumeLevel >= 1 && volumeLevel <= 500) {
            this.volumeLevel = volumeLevel;
        }
    }

    public void channelUp() {
        if (this.isOn == true && channel < 120) {
            this.channel++;
        }
    }

    public void channelDown() {
        if (this.isOn == true && channel > 1) {
            this.channel--;
        }
    }

    public void volumeUp() {
        if (this.isOn == true && this.volumeLevel < 500) {
            this.volumeLevel++;
        }
    }

    public void volumeDown() {
        if (this.isOn == true && this.volumeLevel > 1) {
            this.volumeLevel--;
        }
    }

    static int getNumberOfTv() {

        return numberOfTv;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}
