package study.jv;

public class Step03 {

    public void main(String[] args) throws Exception {
        int number1 = 4;
        long number2 = number1;

        System.out.println(number1 + number2);
    }

    public static void printAgeIfPerson(Object obj) {
        // instanceof 변수가 주어진 타입이면 true 그렇지 않으면 false
        if(obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }

}
