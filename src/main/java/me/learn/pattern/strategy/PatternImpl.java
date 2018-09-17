package me.learn.pattern.strategy;

import me.learn.pattern.Pattern;
import me.learn.pattern.strategy.content.Animal;
import me.learn.pattern.strategy.content.PugDog;
import me.learn.pattern.strategy.content.impl.BigDogSpeech;
import me.learn.pattern.strategy.content.impl.SlowWalkingMove;

public class PatternImpl implements Pattern {

    public void doIt() {
        System.out.println("Pattern \"Strategy\"");
        Animal pugDog = new PugDog();
        pugDog.display();
        pugDog.move();
        pugDog.move();
        pugDog.speech();
        pugDog.setMoveBehavior(new SlowWalkingMove());
        pugDog.move();
        pugDog.setSpeechBehavior(new BigDogSpeech());
        pugDog.speech();
    }

}
