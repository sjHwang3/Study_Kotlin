package study.kt.study08;

public class Step02_defaultParameter {

    public static void main(String[] args) {

    }

    public void repeat(String str, int num, boolean useNewLine) {
        for(int i = 1; i <= num; i++){
            if(useNewLine){
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    /** overloading **/
    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    /** overloading **/
    public void repeat(String str) {
        repeat(str, 3, true);
    }

}
