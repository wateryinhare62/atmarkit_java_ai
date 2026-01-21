import java.io.IOException;

public class App {
    public static void main(String[] args) {
        FileService svc = new FileService();
        String path = "data.txt"; // 存在しない場合は IOException が発生
        try {
            String line = svc.readFirstLine(path);
            System.out.println("読み取り成功: " + line);
        } catch (IOException e) {
            System.err.println("IOException を捕捉しました: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
