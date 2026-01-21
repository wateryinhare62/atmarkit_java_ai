import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
    public String readFirstLine(String path) throws IOException {
        try (AutoResource ar = new AutoResource("auto1");
             BufferedReader br = new BufferedReader(new FileReader(path))) {
            ar.doSomething();
            return br.readLine();
        }
    }
}
