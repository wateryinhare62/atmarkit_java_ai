// 親クラス（スーパークラス）
class Animal {
    // 共通のプロパティ
    protected String name;

    // コンストラクタ
    public Animal(String name) {
        this.name = name;
    }

    // 共通のメソッド
    public void move() {
        System.out.println(name + "が移動します。");
    }
}

// 子クラス（サブクラス）
class Dog extends Animal {
    // コンストラクタ
    public Dog(String name) {
        super(name); // 親クラスのコンストラクタを呼び出す
    }

    // 子クラス独自のメソッド
    public void bark() {
        System.out.println(name + "が吠えます。");
    }

    // 親クラスのメソッドをオーバーライド
    @Override
    public void move() {
        System.out.println(name + "が走ります。");
    }
}

// 子クラス（サブクラス）
class Cat extends Animal {
    // コンストラクタ
    public Cat(String name) {
        super(name); // 親クラスのコンストラクタを呼び出す
    }

    // 子クラス独自のメソッド
    public void meow() {
        System.out.println(name + "が鳴きます。");
    }
}

public class App {
    public static void main(String[] args) {
        // 子クラスのインスタンスを作成
        Dog dog = new Dog("ポチ");
        Cat cat = new Cat("タマ");

        // 親クラスのメソッドを利用
        dog.move(); // ポチが走ります。
        cat.move(); // タマが移動します。

        // 子クラス独自のメソッドを利用
        dog.bark(); // ポチが吠えます。
        cat.meow(); // タマが鳴きます。

        // 多態性の例
        Animal animal = new Dog("ハチ");
        animal.move(); // ハチが走ります。（Dogクラスのmoveが呼ばれる）
    }
}