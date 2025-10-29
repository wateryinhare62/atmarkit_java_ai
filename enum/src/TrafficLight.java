public enum TrafficLight {
    RED(30) {
        @Override
        public TrafficLight next() { return GREEN; }
    },
    GREEN(45) {
        @Override
        public TrafficLight next() { return YELLOW; }
    },
    YELLOW(5) {
        @Override
        public TrafficLight next() { return RED; }
    };

    private final int durationSeconds;

    TrafficLight(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    // 各状態の保持時間（秒）を返す
    public int duration() {
        return durationSeconds;
    }

    // 現在の信号で進行可能かを判定（GREEN のときのみ true）
    public boolean canGo() {
        return this == GREEN;
    }

    // 次の信号状態を返す（各定数でオーバーライド）
    public abstract TrafficLight next();
}
