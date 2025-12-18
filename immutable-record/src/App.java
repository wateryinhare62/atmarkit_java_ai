import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        PersonRecord p = new PersonRecord("Bob", 28, 
            LocalDate.of(1997, 1, 15));
        System.out.println("PersonRecord: " + p);
        System.out.println("Name: " + p.name());
        System.out.println("Is adult: " + p.isAdult());

        // record は不変なので Map のキーとして安全に使用できる
        Map<PersonRecord, String> map = new HashMap<>();
        map.put(p, "developer");
        System.out.println("Map lookup: " + map.get(p));

        // ミューテータが存在しないため、フィールドの変更はコンパイル時に防止される
        // p.name = "Alice"; // コンパイルエラーになる（コメントはデモ）
    }
}
