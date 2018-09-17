package me.learn.pattern.observer.content.impl;

import me.learn.pattern.observer.content.face.Observer;
import me.learn.pattern.observer.content.face.Subject;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Stock implements Subject {

    private List<Observer> observers;
    private Map<String, Double> data;

    private Random rand;
    private double currBitcoinQuote;
    private double currEtherQuote;

    public Stock(){
        observers = new ArrayList<Observer>();
        data = new HashMap<String, Double>();
        rand = new Random();
        currBitcoinQuote = 6000.00;
        currEtherQuote = 300.00;
    }

    public void reg(Observer observer) {
        observers.add(observer);
    }

    public void unreg(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(data));
    }

    public void start(int count){
        try {
            for (int i = 0; i < count; i++) {
                TimeUnit.MILLISECONDS.sleep(500);
                currBitcoinQuote = evalQuote(currBitcoinQuote);
                currEtherQuote = evalQuote(currEtherQuote);
                data.put("BITCOIN", currBitcoinQuote);
                data.put("ETHER", currEtherQuote);
                notifyObservers();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private double evalQuote(double currQuote){
        double delta = (double) rand.nextInt(10000) / 100;
        return rand.nextBoolean() ? currQuote + delta : currQuote - delta;
    }

}
