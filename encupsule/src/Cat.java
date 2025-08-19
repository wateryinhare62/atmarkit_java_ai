public class Cat {
    // 名前 (name) フィールド
    private String name;

    // 年齢 (age) フィールド
    private int age;

    // コンストラクタ
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 名前を取得するメソッド
    public String getName() {
        return name;
    }

    // 名前を設定するメソッド
    public void setName(String name) {
        this.name = name;
    }

    // 年齢を取得するメソッド
    public int getAge() {
        return age;
    }

    // 年齢を設定するメソッド
    public void setAge(int age) {
        this.age = age;
    }

    // 猫の情報を表示するメソッド
    public void displayInfo() {
        System.out.println("名前: " + name + ", 年齢: " + age + "歳");
    }
}
