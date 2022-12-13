package study.kt.study10.jv.classes;

import study.kt.study10.jv.interfaces.JavaFlyable;
import study.kt.study10.jv.interfaces.JavaSwimable;

public class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimable {

    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄이 움직입니다~ 뒤뚱뒤뚱");
    }

    @Override
    public int getLegCount() {
        return super.legCount + this.wingCount;
    }

    @Override
    public void act() {
        JavaFlyable.super.act();
        JavaSwimable.super.act();
    }
}
