// Catクラスを作成
public class Cat {
    private String name;
    private int age;

    // コンストラクタ
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 引数なしのメソッド
    public void meow() {
        System.out.println(name + " says meow!");
    }

    // 引数ありのメソッド
    public String meow(int times) {
        StringBuilder sound = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sound.append(name).append(" says meow! ");
        }
        return sound.toString();
    }
}
