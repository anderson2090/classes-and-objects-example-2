public class Main {
    public static void main(String[] args) {

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();

        tv2.turnOn();
        tv2.setChannel(22);
        tv2.channelUp();

        System.out.println("tv1 channel is "+tv1.channel+" and volume is "+tv1.volumeLevel);
        System.out.println("tv2 channel1 is "+tv2.channel+" and volume is "+tv2.volumeLevel);



    }
}