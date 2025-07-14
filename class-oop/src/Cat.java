// Catクラスを生成
class Cat {
    // プロパティ
    String name;
    int age;

    // コンストラクタ
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド
    void meow() {
        System.out.println(name + " says meow!");
    }

    // 鳴く回数を指定して文字列を返すmeowメソッド
    String meow(int times) {
        StringBuilder sound = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sound.append(name).append(" says meow! ");
        }
        return sound.toString();
    }
}