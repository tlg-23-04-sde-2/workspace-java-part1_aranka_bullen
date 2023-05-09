package donr.wakeme;/*
 * APPLICATION TEST CLASS TO VERIFY CORRECCT BEHAVIOR OF OUR SETTER VALIDATION
 * BVT = BOUNDARY VALUE TESTING
 * FOR A [1,20] RANGE, YOU NEED TO CHECK;
 *      0,1     AND     20,21
 */

class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(0);         // error message, value not set, value should be the set default

        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(1);         // should "stick" -> 'clock' indeed has this value
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);        // should "stick" -> 'clock' indeed has this value
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21);        // errror message should appear, should retain/display the last validated input
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());
    }

}