/**
 * Business class or "system class" to model the working of Television
 *
 */

class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static int instanceCount = 0;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    public static int getInstanceCount() {
        return instanceCount;
    }
    // instance variables or fields (properties or attributes)
    // This set the default variable if the object in question is not set
    private String brand = "Toshiba"; //default value when client does not specify (otherwise null)
    private int volume = 1; //default value when client does not specify (otherwise 0)
    private DisplayType display = DisplayType.LED; //otherwise null

    private boolean isMuted; // for muting behavior, getter only (named "isMuted()")
    private int oldVolume; //for muting behavior internal use only, Mo get/set methods

    //constructors
    public Television() {
        instanceCount++;
        isMuted = false;
    }


    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }
    public Television(String brand, int volume, DisplayType display) {
        this(brand,volume);
        setDisplay(display);



    }



    // business methods or operations
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("TURNING ON " + brand + " TV");
        System.out.println(" TV Volume: " + volume);
        System.out.println();
    }

    private boolean verifyInternetConnection() {
        return true;
    }


    public void mute() {
        if (!isMuted()) {
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;
        }
        else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public void turnOff() {
        System.out.println("TURNING OFF " + brand + " TV");
    }


    // accessor methods
    /*
     * for (String validBrand : VALID_BRANDS) {
     * // Checks the incoming brand against the validBrand using the equals()
     * }

     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
            case "LG":
            case "Toshiba":
            case "Sony":
                this.brand = brand;
                break;
            default:
                System.out.println(brand + " is an invalid entry. Valid brands are Samsung, Sony, Toshiba, and LG.");
        }
    }
    /*
    if (brand.equals("samsung")     ||
        brand.equals("LG")          ||
        brand.equals("Sony")        ||
        brand.equals(Toshiba")      ||
        this.brand = brand;
    }
    else {
         System.out.println(brand + " is an invalid entry. Valid brands are Samsung, Sony, Toshiba, and LG.");
    }
     */



    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME ) {
            this.volume = volume;

            //
            isMuted = false;
        } else {
            if (volume < MIN_VOLUME) {
                System.out.println(" Invalid request. " + MIN_VOLUME + "  is the lowest possible setting");
            }
            if (volume > MAX_VOLUME) {
                System.out.println("Invalid request. " + MAX_VOLUME + " is the highest possible setting");
            }
        }
    }

    public boolean isMuted() {
        return isMuted;
    }

    public int getOldVolume() {
        return oldVolume;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: Brand = " + getBrand() + ", Volume = " + volumeString + ", Display = " + getDisplay();
    }



}