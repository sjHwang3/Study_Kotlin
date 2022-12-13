package study.kt.study13.jv;

public class JavaHouse {

    private String address;
    private LivingRoom livingRoom;

    public JavaHouse(String address, LivingRoom livingRoom) {
        this.address = address;
        this.livingRoom = livingRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    /*
        public static class ~ 로 선언하면 외부에서 해당 클래스를 사용할 수 없다.

        클래스 안의 내부 클래스를 선언 할 경우 static으로 선언하지 않는다면
        아래 문제점이 있을 수 있어 지양하는 편이다.

        1. 내부 클래스는 숨겨진 외부 클래스 정보를 가지고 있어,
           참조를 해지 하지 못하는 경우 메모리 누수가 생길 수 있고,
           이를 디버깅 하기가 어렵다.
        2. 내부 클래스의 직렬화 형태가 명확하게 정의되지 않아
           직렬화에 있어 제한이 있을 수 있다.
     */
    public /* static */ class LivingRoom {
        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }

        /*
            Living Room Class가 static으로 선언이 되었을 경우
            JavaHouse을 사용할 수 없어 에러가 발생한다.
         */
        public String getAddress() {
            return JavaHouse.this.address;
        }
    }

}
