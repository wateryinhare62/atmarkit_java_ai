public final class WeekdayConstants {
    private WeekdayConstants() { /* インスタンス化を防ぐ */ }

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    // ユーティリティメソッド
    public static boolean isWeekend(int day) {
        return day == SATURDAY || day == SUNDAY;
    }

    public static String toString(int day) {
        switch (day) {
            case MONDAY: return "MONDAY";
            case TUESDAY: return "TUESDAY";
            case WEDNESDAY: return "WEDNESDAY";
            case THURSDAY: return "THURSDAY";
            case FRIDAY: return "FRIDAY";
            case SATURDAY: return "SATURDAY";
            case SUNDAY: return "SUNDAY";
            default: return "UNKNOWN";
        }
    }
}
