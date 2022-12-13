package study.kt.study08;

public class Step04_multiParameter {
    public static void main(String[] args) {
        // 1) 배열
        String[] strArr = new String[]{"A", "B", "C"};
        printAll(strArr);


        // 2) comma를 이용하여 여러 파라미터 대입
        printAll("A", "B", "C");
    }

    public static void printAll(String... strings) {
        for(String str : strings){
            System.out.println(str);
        }
    }
}
