public enum WeekdayEnum {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    @Override
    public String toString() {
        return name();
    }
}
