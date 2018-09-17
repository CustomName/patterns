package me.learn.pattern.strategy.content;

import me.learn.pattern.strategy.content.face.MoveBehavior;
import me.learn.pattern.strategy.content.face.SpeechBehavior;

public abstract class Animal {

    private MoveBehavior moveBehavior;
    private SpeechBehavior speechBehavior;

    public abstract void display();

    public void setMoveBehavior(MoveBehavior behavior){
        moveBehavior = behavior;
    }

    public void setSpeechBehavior(SpeechBehavior behavior){
        speechBehavior = behavior;
    }

    public void move(){
        System.out.printf("Двигаюсь %d\n", moveBehavior.move());
    }

    public void speech(){
       System.out.printf("Говорю \"%s\"\n", speechBehavior.speech());
    }

}
