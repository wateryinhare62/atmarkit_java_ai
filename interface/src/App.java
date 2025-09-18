// インターフェースを使った例
interface Animal {
    void move();
}

class Dog implements Animal {
    private String name;
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void move() {
        System.out.println(name + "が走ります。");
    }
    public void bark() {
        System.out.println(name + "が吠えます。");
    }
}

class Cat implements Animal {
    private String name;
    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void move() {
        System.out.println(name + "が移動します。");
    }
    public void meow() {
        System.out.println(name + "が鳴きます。");
    }
}

class Bird implements Animal {
    private String name;
    public Bird(String name) {
        this.name = name;
    }
    @Override
    public void move() {
        System.out.println(name + "が飛びます。");
    }
    public void sing() {
        System.out.println(name + "がさえずります。");
    }
}

public class App {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("ジョン"),
            new Cat("シロ"),
            new Bird("ピヨ")
        };
        for (Animal a : animals) {
            a.move();
        }
        ((Bird)animals[2]).sing();
    }
}
