import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // List<String> の簡単なサンプル
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits list size: " + fruits.size());

        // 拡張forループで表示
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // インデックスでアクセス
        System.out.println("First fruit: " + fruits.get(0));

        // 要素の削除
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // null と空リストの扱い
        List<String> empty = new ArrayList<>();
        System.out.println("Is empty list empty? " + empty.isEmpty());

        // ジェネリクスの型安全性の例 (コンパイル時にチェックされる)
        // fruits.add(123); // ← これはコンパイルエラーになる
    }
}
