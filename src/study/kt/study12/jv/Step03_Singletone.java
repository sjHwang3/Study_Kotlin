package study.kt.study12.jv;

public class Step03_Singletone {

    private static final Step03_Singletone INSTANCE = new Step03_Singletone();

    private Step03_Singletone() { }

    public static Step03_Singletone getInstance() {
        return INSTANCE;
    }

}
