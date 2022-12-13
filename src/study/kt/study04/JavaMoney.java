package study.kt.study04;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class JavaMoney implements Comparable<JavaMoney>{

    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    public JavaMoney plus(JavaMoney other) {
        return new JavaMoney(this.amount + other.amount);
    }

    // 같으면 0, 작으면 양수, 크면 음수 반환
    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaMoney javaMoney = (JavaMoney) o;
        return amount == javaMoney.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JavaMoney{");
        sb.append("amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
