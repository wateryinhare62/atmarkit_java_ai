import java.io.IOException;

public class App {
    public static void main(String[] args) {
        FileService svc = new FileService();
        try {
            String result = svc.process();
            System.out.println("結果: " + result);
        } catch (IOException e) {
            System.err.println("IOException を捕捉しました: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
