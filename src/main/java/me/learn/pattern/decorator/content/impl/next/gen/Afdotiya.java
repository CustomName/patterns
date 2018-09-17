package me.learn.pattern.decorator.content.impl.next.gen;

import me.learn.pattern.decorator.content.face.Matrena;
import me.learn.pattern.decorator.content.face.MatrenaDecorator;

public class Afdotiya extends MatrenaDecorator {

    private Matrena matrena;

    public Afdotiya(Matrena matrena){
        this.matrena = matrena;
    }

    @Override
    public int count() {
        return 1 + matrena.count();
    }

    @Override
    public String introduce() {
        return String.format("I'm Afdotiya. I contain other matrena: \"%s\"",
                                matrena.introduce());
    }

}
