package me.learn.pattern.decorator.content.impl.first.gen;

import me.learn.pattern.decorator.content.face.Matrena;

public class Polina implements Matrena {

    @Override
    public int count() {
        return 1;
    }

    @Override
    public String introduce() {
        return "I'm Polina. The first matrena";
    }

}
