package study.kt.study04;

public class Step03 {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = new JavaMoney(2_000L);

        System.out.println(money1.plus(money2));
    }

}
