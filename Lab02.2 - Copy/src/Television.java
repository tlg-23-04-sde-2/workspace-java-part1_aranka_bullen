/**
 * Business class or "system class" to model the working of Television
 *
 */

class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }
    // instance variables or fields (properties or attributes)
    // This set the default variable if the object in question is not set
    private String brand = "Toshiba"; //default value when client does not specify (otherwise null)
    private int volume = 1; //default value when client does not specify (otherwise 0)

    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }



    // business methods or operations
    // This is the method called to turn on the Television
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("TURNING ON " + brand + " TV");
        System.out.println(" TV Volume: " + volume);
        System.out.println();
    }

    // This is the method called to turn off the Television
    public void turnOff() {
        System.out.println("TURNING OFF " + brand + " TV");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection();
        return true; // fake implementation



//   public static void setInstanceCount(int instanceCount) {
//        Television.instanceCount = instanceCount;
//    }

    public String toString() {
        return "Loading: " + brand + " " + volume;
    }
}