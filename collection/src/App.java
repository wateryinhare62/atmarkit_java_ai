import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        // HashSet は順序を保証せず、同じ要素の重複を許さない
        Set<String> items = new HashSet<>();

        // 要素を追加（重複の追加は無視される）
        items.add("apple");
        items.add("banana");
        items.add("orange");
        items.add("apple"); // 2回目の追加は無視される

        // サイズは重複が無視されるため 3
        System.out.println("Size: " + items.size());

        // contains で存在確認
        System.out.println("Contains banana? " + items.contains("banana"));

        // 要素の反復（順序は保証されない）
        for (String s : items) {
            System.out.println(s);
        }

        // 削除
        items.remove("orange");
        System.out.println("After remove orange, size: " + items.size());

        // --- HashMap の簡単なサンプル ---
        System.out.println();
        System.out.println("---- HashMap sample ----");
        Map<String, Integer> counts = new HashMap<>();

        // put で値を設定
        counts.put("apple", 2);
        counts.put("banana", 3);
        counts.put("orange", 1);

        // 値の更新（既存の値を読み出して加算）
        counts.put("apple", counts.get("apple") + 1); // apple の個数を1増やす

        // get と containsKey
        System.out.println("Apple count: " + counts.get("apple"));
        System.out.println("Has key 'banana'? " + counts.containsKey("banana"));

        // エントリごとの反復（キーと値を同時に取り出せる）
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 削除
        counts.remove("orange");
        System.out.println("After remove orange, keys: " + counts.keySet());
    }
}
