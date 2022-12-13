package study.kt.study14.jv.data;

public enum JavaCountry {

    KOREA("KO"),
    AMERICA("US");


    private final String code;

    JavaCountry(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}