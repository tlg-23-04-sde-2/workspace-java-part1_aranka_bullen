import org.w3c.dom.ls.LSOutput;

/**
 * Client-side main-class to create a few  instances of Televison
 * and give them a basic test-drive
 */
class TelevisionClient {

    // This is the start of the instance
    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        // This the first set instance of Television, and it has a set properties
        Television tv1 = new Television();

        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MIN_VOLUME);

        //This is the 2nd instance of Television, and it has set properties
        Television tv2 = new Television("Sony", 50);

        //tv2.setBrand("Roku");
        //tv2.setVolume(24);

        // This is the 3rd instance of Television, but there is no set properties
        // Therefore, this instance should revert to the default properties set on the business-side.
        Television tv3 = new Television("LG");
        tv3.setVolume(Television.MAX_VOLUME);

        Television tv4 = new Television("Toshiba", 50, DisplayType.OLED);



        // This is where the method are called to be executed.
        tv1.turnOn();
        tv1.turnOff();
        System.out.println();
        tv2.turnOn();
        tv2.turnOff();
        System.out.println();
        tv3.turnOn();
        tv3.turnOff();

        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3); // toString called automatically
        System.out.println(tv4);

        System.out.println();

        System.out.println(Television.getInstanceCount() + " total instances created");

    }
}