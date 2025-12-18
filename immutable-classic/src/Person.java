import java.util.Date;
import java.util.Objects;

/**
 * クラシックな不変オブジェクトの例。
 * - クラスは final
 * - フィールドは private final
 * - コンストラクタで完全に初期化
 * - 可変フィールド（Date）は防御的コピーを行う
 */
public final class Person {
    private final String name;
    private final int age;
    private final Date birthDate; // 可変なフィールドの例

    public Person(String name, int age, Date birthDate) {
        this.name = Objects.requireNonNull(name, "name");
        this.age = age;
        this.birthDate = (birthDate == null) ? null : new Date(birthDate.getTime());
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    // 防御的コピーを返すことで内部状態を外部から変更できなくする
    public Date getBirthDate() {
        return (birthDate == null) ? null : new Date(birthDate.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return age == other.age
            && name.equals(other.name)
            && (birthDate == null ? other.birthDate == null 
                : birthDate.getTime() == other.birthDate.getTime());
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Integer.hashCode(age);
        result = 31 * result + (birthDate == null ? 0 
            : Long.hashCode(birthDate.getTime()));
        return result;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", birthDate=" 
            + (birthDate == null ? null : birthDate.toString()) + "}";
    }
}
