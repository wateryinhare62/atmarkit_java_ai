import java.time.LocalDate;
import java.util.Objects;

/**
 * record を使った不変オブジェクトの例。
 * - フィールドは暗黙的に final
 * - コンパクトコンストラクタで入力検証
 * - 不変な型（LocalDate）を利用して防御的コピー不要
 */
public record PersonRecord(String name, int age, LocalDate birthDate) {
    public PersonRecord {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(birthDate, "birthDate");
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return name + " (age=" + age + ", birthDate=" + birthDate + ")";
    }
}
