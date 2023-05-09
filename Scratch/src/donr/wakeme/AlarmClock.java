package donr.wakeme;

/**
 * Class definition to model the workings of an alarm clock.
 * This is called a "business class" or a "system class".
 * This class definition does not have a main() method- most classes don't.
 */

class AlarmClock {
    //class-level (shared) variables - these live in that share/common area "above" all the instances
    // there is only ONE COPY of these.
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;


    // properties or attributes - called "instance variables" or "fields" in Java.
    private int snoozeInterval = 5; // default value when client does not specify
    private int repeat = 1;         // default value when not specify


    // constructor goes here
    public AlarmClock() {           // no argument constructors
    }

    public AlarmClock(int snoozeInterval) {     // one argument constructor
        setSnoozeInterval(snoozeInterval);
    }

    public AlarmClock(int snoozeInterval, int repeat) {     // two argument constructor
        this(snoozeInterval);                               // this delegates to above ctor for variable validation
        setRepeat(repeat);
    }




    // function or "methods" - client do donr.wakeme.AlarmClock do?
    // business methods - these perform "busines tasks" or operations
    void snooze() {
        System.out.println("Snoozing " + snoozeInterval + " minutes");
        }

    // accessor methods - provide "controlled access" to the object's fields
    // These are also called get/set methods. Often come in pairs
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    //TODO: business constraint must be between [1,20] inclusive
    public void setSnoozeInterval(int snoozeInterval) {
        if(snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;

        }
        else {
            System.out.println("Invalid SnoozeInterval: " + snoozeInterval);
            System.out.println("Enter a value between " + MIN_INTERVAL + " and " + MAX_INTERVAL);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {
            return "snoozeInterval = " + getSnoozeInterval() +
                    " repeat = " + getRepeat();
    }
}