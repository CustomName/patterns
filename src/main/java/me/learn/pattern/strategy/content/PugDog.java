package me.learn.pattern.strategy.content;

import me.learn.pattern.strategy.content.impl.FastWalkingMove;
import me.learn.pattern.strategy.content.impl.SmallDogSpeech;

public class PugDog extends Animal {

    public PugDog(){
        setMoveBehavior(new FastWalkingMove());
        setSpeechBehavior(new SmallDogSpeech());
    }

    public void display() {
        System.out.println("I'm PugDog");
    }

}
