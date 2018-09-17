package me.learn.pattern.strategy.content.impl;

import me.learn.pattern.strategy.content.face.SpeechBehavior;

public class BigDogSpeech implements SpeechBehavior {

    public String speech() {
        return "ГАВ-ГАВ";
    }

}
