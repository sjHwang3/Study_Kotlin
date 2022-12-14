package study.kt.study16.jv;

public class JavaPerson {

    private final String firstName;
    private int age;

    public JavaPerson(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public int nextYearAge() {
        System.out.println("멤버 함수");
        return this.age + 1;
    }

    public int getAge() {
        return age;
    }

}
