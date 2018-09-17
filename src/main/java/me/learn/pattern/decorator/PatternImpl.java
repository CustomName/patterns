package me.learn.pattern.decorator;

import me.learn.pattern.Pattern;
import me.learn.pattern.decorator.content.face.Matrena;
import me.learn.pattern.decorator.content.impl.first.gen.Galina;
import me.learn.pattern.decorator.content.impl.next.gen.Afdotiya;
import me.learn.pattern.decorator.content.impl.next.gen.Katerina;

public class PatternImpl implements Pattern {

    @Override
    public void doIt() {
        System.out.println("Pattern \"Decorator\"");
        Matrena matrena = new Afdotiya(new Galina());
        matrena = new Katerina(matrena);
        matrena = new Katerina(matrena);
        System.out.printf("There are %d matrens. %s\n", matrena.count(), matrena.introduce());
    }

}
