public class App {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;

        // 6ステップ分、状態と振る舞いを出力して次の状態へ遷移
        for (int i = 0; i < 6; i++) {
            System.out.println("Light: " + light + ", canGo=" + light.canGo() 
                + ", duration=" + light.duration() + "s");
            light = light.next();
        }
    }
}
