package me.learn.pattern.observer.content.impl;

import me.learn.pattern.observer.content.face.Observer;

import java.util.Map;

public class QuotesScreen implements Observer {

    private Stock stock;

    public QuotesScreen(Stock stock){
        this.stock = stock;
    }

    @Override
    public void update(Map<String, Double> data) {
        System.out.printf("Экран котировок: %s\n", data.toString());
    }

}
