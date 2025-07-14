public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Catクラスのインスタンス化
        Cat myCat = new Cat("Mittens", 3);

        // meowメソッドを2つ呼び出す
        myCat.meow(); // 引数なしのメソッド呼び出し
        String sound = myCat.meow(3); // 引数ありのメソッド呼び出し
        System.out.println(sound); // 返り値を表示
    }
}
