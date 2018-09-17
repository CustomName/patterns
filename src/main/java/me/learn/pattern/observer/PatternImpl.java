package me.learn.pattern.observer;

import me.learn.pattern.Pattern;
import me.learn.pattern.observer.content.impl.QuotesScreen;
import me.learn.pattern.observer.content.impl.Stock;
import me.learn.pattern.observer.content.face.Observer;

public class PatternImpl implements Pattern {

    public void doIt() {
        System.out.println("Pattern \"Observer\"");
        Stock stock = new Stock();
        Observer observer1 = new QuotesScreen(stock);
        stock.reg(observer1);
        stock.start(6);
    }

}
