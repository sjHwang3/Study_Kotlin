package study.kt.study04;

public class Step01 {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2_000L);
        JavaMoney money2 = new JavaMoney(1_000L);
        JavaMoney money3 = new JavaMoney(1_000L);
        JavaMoney money4 = money3;

        if(money1.compareTo(money2) > 0){
            System.out.println("Money1이 Money2보다 금액이 큽니다");
        }

        System.out.println(money2 == money3);
        System.out.println(money3.equals(4));
    }

}
