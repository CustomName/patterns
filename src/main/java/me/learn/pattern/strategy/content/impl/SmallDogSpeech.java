package me.learn.pattern.strategy.content.impl;

import me.learn.pattern.strategy.content.face.SpeechBehavior;

public class SmallDogSpeech implements SpeechBehavior {

    public String speech() {
        return "тяф-тяф";
    }

}
