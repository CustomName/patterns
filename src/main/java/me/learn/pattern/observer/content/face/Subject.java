package me.learn.pattern.observer.content.face;

public interface Subject {

    void reg(Observer observer);
    void unreg(Observer observer);
    void notifyObservers();

}
