package study.jv;

import com.sun.istack.internal.Nullable;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Nullable
    public String getName() {
        return name;
    }

    @Nullable
    public int getAge() {
        return age;
    }
}
