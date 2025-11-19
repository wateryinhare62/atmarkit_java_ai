public class WeekdayApp {
    public static void main(String[] args) {
        int today = WeekdayConstants.WEDNESDAY;

        System.out.println("Today: " + WeekdayConstants.toString(today));
        System.out.println("Is weekend? " + WeekdayConstants.isWeekend(today));

        // ループで全曜日を表示
        for (int d = WeekdayConstants.MONDAY; d <= WeekdayConstants.SUNDAY; d++) {
            System.out.println(d + ": " + WeekdayConstants.toString(d) 
                + (WeekdayConstants.isWeekend(d) ? " (weekend)" : ""));
        }

        // 間違った値の例
        int invalid = 99;
        System.out.println("Invalid: " + WeekdayConstants.toString(invalid));

        // --- ここから enum を使ったサンプル ---
        System.out.println();
        System.out.println("--- WeekdayEnum sample ---");

        WeekdayEnum eToday = WeekdayEnum.WEDNESDAY;
        System.out.println("Today (enum): " + eToday);
        System.out.println("Is weekend? (enum) " + eToday.isWeekend());

        // 全曜日を列挙して表示
        for (WeekdayEnum wd : WeekdayEnum.values()) {
            System.out.println(wd.ordinal() + 1 + ": " + wd + (wd.isWeekend() ? " (weekend)" : ""));
        }

        // --- さらに進んだ enum のサンプル ---
        System.out.println();
        System.out.println("--- WeekdayEnumAdvance sample ---");

        WeekdayEnumAdvance advToday = WeekdayEnumAdvance.WEDNESDAY;
        System.out.println("Today (advance): " + advToday + " number=" + advToday.getNumber() 
            + " short=" + advToday.getShortName());
        System.out.println("Is weekend? (advance) " + advToday.isWeekend());
        System.out.println("Next: " + advToday.next() + ", Previous: " + advToday.previous());

        // fromNumber の利用
        System.out.println("From number 5: " + WeekdayEnumAdvance.fromNumber(5));
        System.out.println("From number 99: " + WeekdayEnumAdvance.fromNumber(99));

        // EnumSet を使った週末判定例
        java.util.EnumSet<WeekdayEnumAdvance> weekendSet 
            = java.util.EnumSet.of(WeekdayEnumAdvance.SATURDAY, WeekdayEnumAdvance.SUNDAY);
        System.out.println("Is Saturday in weekendSet? " 
            + weekendSet.contains(WeekdayEnumAdvance.SATURDAY));
    }
}
