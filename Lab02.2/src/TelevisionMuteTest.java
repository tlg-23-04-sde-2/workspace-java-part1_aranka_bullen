class TelevisionMuteTest {

    public static void main(String[] args) {
        Television tv = new Television();
        tv.mute();
        System.out.println("TV is muted: " + tv.isMuted());
    }

    public static void mute(Television tv) {
        if (!tv.isMuted()) {
            tv.mute();
        }
    }

    public static void unmute(Television tv) {
        if (tv.isMuted()) {
            tv.setVolume(tv.getOldVolume());
        }
    }

}