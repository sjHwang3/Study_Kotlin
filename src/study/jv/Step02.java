package study.jv;

public class Step02 {

    public void main(String[] args) throws Exception {
        startsWithA("A");
        System.out.println(startsWithILAE(null));
        System.out.println(startsWithRtnNull(null));
        System.out.println(startsWithRtnFalse(null));
        System.out.println(startsWithNPE(null));
    }

    public boolean startsWithA(String str) {
        return str.startsWith("A");
    }

    /**
     * 자바에서 NPE 처리하는 방법
     * 1) Exception을 발생시킨다.
     * @param str
     * @return
     * @throws IllegalAccessException
     */
    public boolean startsWithILAE(String str) throws IllegalAccessException {
        if(str == null){
            throw new IllegalAccessException("null이 들어왔습니다.");
        }

        return str.startsWith("A");
    }

    /**
     * 2) null을 반환한다.
     * @param str
     * @return
     */
    public Boolean startsWithRtnNull(String str) {
        if(str == null){
            return null;
        }

        return str.startsWith("A");
    }

    /**
     * 3) null을 false로 반환한다.
     * @param str
     * @return
     */
    public boolean startsWithRtnFalse(String str) {
        if(str == null){
            return false;
        }

        return str.startsWith("A");
    }

    /**
     * nullpointer 발생
     * @param str
     * @return
     */
    public boolean startsWithNPE(String str) {
        return str.startsWith("A");
    }

}
