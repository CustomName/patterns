package me.learn.pattern.decorator.content.impl.first.gen;

import me.learn.pattern.decorator.content.face.Matrena;

public class Galina implements Matrena {

    @Override
    public int count() {
        return 1;
    }

    @Override
    public String introduce() {
        return "I'm Galina. The first matrena";
    }

}
