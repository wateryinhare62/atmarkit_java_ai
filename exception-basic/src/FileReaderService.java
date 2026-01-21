import java.io.IOException;

public class FileReaderService {
    public String readFile() throws IOException {
        // 外部IOエラーを意図的に発生させる（実際のファイル操作の代替）
        throw new IOException("ファイルを開けません: data.txt");
    }
}
