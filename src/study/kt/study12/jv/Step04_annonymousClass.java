package study.kt.study12.jv;

public class Step04_annonymousClass {

    public static void main(String[] args) {
        moveSomething(new Movable() {

            @Override
            public void move() {

            }

            @Override
            public void fly() {

            }

        });
    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }

}
