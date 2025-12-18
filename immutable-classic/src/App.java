import java.util.Date;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Date birth = new Date();
        Person p = new Person("Alice", 30, birth);

        System.out.println("Original person: " + p);

        // 外部の birth を変更しても Person の内部は変わらない
        birth.setTime(0);
        System.out.println("After modifying external Date, person: " + p);

        // getter から返された Date を変更しても内部は変わらない
        Date got = p.getBirthDate();
        if (got != null) {
            got.setTime(0);
        }
        System.out.println("After modifying returned Date, person: " + p);

        // 不変オブジェクトは Map のキーとして安全に使える
        Map<Person, String> map = new HashMap<>();
        map.put(p, "engineer");
        System.out.println("Map lookup: " + map.get(p));
    }
}
