import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Stringだけを入れるList（ジェネリクス）
        List<String> names = new ArrayList<>();

        // 要素の追加
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // コンパイル時に型チェックされるため、間違った型は追加できない
        // names.add(123); // <-- コンパイルエラーになる

        // 要素数と取り出し
        System.out.println("Names count: " + names.size());
        for (String name : names) {
            System.out.println(name);
        }

        // 取り出した値は型が決まっているのでキャスト不要
        String first = names.get(0);
        System.out.println("First name: " + first);
    }
}
