package me.learn.pattern.decorator.content.impl.next.gen;

import me.learn.pattern.decorator.content.face.Matrena;
import me.learn.pattern.decorator.content.face.MatrenaDecorator;

public class Katerina extends MatrenaDecorator {

    private Matrena matrena;

    public Katerina(Matrena matrena){
        this.matrena = matrena;
    }

    @Override
    public int count() {
        return 1 + matrena.count();
    }

    @Override
    public String introduce() {
        return String.format("I'm Katerina. I contain other matrena: \"%s\"",
                                matrena.introduce());
    }

}
