import java.io.IOException;

public class FileService {
    public String process() throws IOException {
        ManualResource res = new ManualResource("resource1");
        try {
            res.use();
            // 処理中にチェック例外が発生する状況をシミュレート
            throw new IOException("処理中にIOエラーが発生しました");
        } finally {
            // 例外が発生しても必ず実行され、リソースを解放する
            res.close();
        }
    }
}
