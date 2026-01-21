import java.io.IOException;

public class App {
    public static void main(String[] args) {
        FileReaderService svc = new FileReaderService();
        try {
            String content = svc.readFile();
            System.out.println("読み取り成功: " + content);
        } catch (IOException e) {
            System.err.println("IOException を捕捉しました: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
