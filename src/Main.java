import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // An array of objects
        TV[] myTvs = {new TV("Tv1"), new TV("Tv2"), new TV("Tv3")};


        TV[] myTvs2 = new TV[100];

        for (int i = 0; i < myTvs2.length - 1; i++) {
            myTvs2[i] = new TV("Tv" + i);
        }


//        System.out.println("Number of TVs " + TV.getNumberOfTv());
//        TV tv1 = new TV();
//        tv1.turnOn();
//        tv1.setChannel(30);
//        tv1.setVolume(3);
//
//        TV tv2 = new TV();
//
//        tv2.turnOn();
//        tv2.setChannel(22);
//        tv2.channelUp();
//
//        printTv(tv1);
//        printTv(tv2);


//        System.out.println("Number of TVs " + TV.getNumberOfTv());
//        System.out.println("tv1 channel is " + tv1.getChannel() + " and volume is " + tv1.getVolumeLevel());
//        System.out.println("tv2 channel1 is " + tv2.getChannel() + " and volume is " + tv2.getVolumeLevel());


    }

//    public static void printTv(TV tv){
//        System.out.println("Tv's volume is "+ tv.getVolumeLevel());
//        System.out.println("Tv's channel is"+tv.getChannel());
//    }


}