package donr.wakeme;

/**
 * This is a client "main-class," i.e., a class definition with the main() method.
 * It will create a few instances of donr.wakeme.AlarmClock and give them a basic testdrive.
 */
class AlarmClockClient {

    // starting point or "entry point" for every standalone Java application
    public static void main(String[] args) {
        // create an instance of donr.wakeme.AlarmClock (an donr.wakeme.AlarmClock object) and set it's properties
        AlarmClock clock1 = new AlarmClock(7, 5);
       // clock1.setSnoozeInterval(-7); // = is an assignment.
       // clock1.setRepeat(5);        // repeats 5 more times


        // create a 2nd instance of donr.wakeme.AlarmClock and set it's properties also.
        AlarmClock clock2 = new AlarmClock(10);
        // clock2.setSnoozeInterval(10);

        //make a 3rd donr.wakeme.AlarmClock object but don't set it's properties.
        AlarmClock clock3 = new AlarmClock();
        clock3.setSnoozeInterval(AlarmClock.MAX_INTERVAL);


        // make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println();

        //show their toString() methods
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3); // toSting() get automatically called
    }
}