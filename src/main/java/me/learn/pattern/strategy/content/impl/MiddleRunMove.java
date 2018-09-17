package me.learn.pattern.strategy.content.impl;

import me.learn.pattern.strategy.content.face.MoveBehavior;

public class MiddleRunMove implements MoveBehavior {

    public int move() {
        return 400;
    }

}
