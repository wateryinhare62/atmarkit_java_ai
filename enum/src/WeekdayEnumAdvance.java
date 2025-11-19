import java.util.Map;
import java.util.HashMap;

public enum WeekdayEnumAdvance {
    MONDAY(1, "Mon", false),
    TUESDAY(2, "Tue", false),
    WEDNESDAY(3, "Wed", false),
    THURSDAY(4, "Thu", false),
    FRIDAY(5, "Fri", false),
    SATURDAY(6, "Sat", true),
    SUNDAY(7, "Sun", true);

    private final int number;
    private final String shortName;
    private final boolean weekend;

    private static final Map<Integer, WeekdayEnumAdvance> BY_NUMBER = new HashMap<>();

    static {
        for (WeekdayEnumAdvance w : values()) {
            BY_NUMBER.put(w.number, w);
        }
    }

    WeekdayEnumAdvance(int number, String shortName, boolean weekend) {
        this.number = number;
        this.shortName = shortName;
        this.weekend = weekend;
    }

    public int getNumber() { return number; }

    public String getShortName() { return shortName; }

    public boolean isWeekend() { return weekend; }

    // 次の曜日（巡回）
    public WeekdayEnumAdvance next() {
        WeekdayEnumAdvance[] arr = values();
        return arr[(this.ordinal() + 1) % arr.length];
    }

    // 前の曜日（巡回）
    public WeekdayEnumAdvance previous() {
        WeekdayEnumAdvance[] arr = values();
        return arr[(this.ordinal() - 1 + arr.length) % arr.length];
    }

    // 数値から取得（見つからなければ null）
    public static WeekdayEnumAdvance fromNumber(int num) {
        return BY_NUMBER.get(num);
    }

    @Override
    public String toString() {
        return name() + "(" + shortName + ")";
    }
}
