package com.hafiz.design.pattern.observer;

import java.util.Vector;

/**
 * Desc: 抽象可被观察者类
 * Created by hafiz.zhang on 2017/7/27.
 */
public abstract class Observable {

    private Vector<Observer> observers;     // 已订阅的观察者集合
    private boolean changed = false;        // 状态

    public Observable() {
        observers = new Vector<>();
    }

    public synchronized void addObserver(Observer observer) {
        if (observer == null) {
            throw new NullPointerException();
        }
        if (!observers.contains(observer)) {
            observers.addElement(observer);
        }
    }

    public synchronized void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public synchronized void setChanged() {
        changed = true;
    }

    public synchronized void clearChanged() {
        changed = false;
    }

    public void notifyObservers(Object args) {
        Observer[] observersLocal;
        synchronized (this) {
            if (!changed) {
                return;
            }
            observersLocal = new Observer[observers.size()];
            observersLocal = observers.toArray(observersLocal);
            clearChanged();
        }
        for (int i = 0; i < observersLocal.length; i++) {
            observersLocal[i].update(this, args);
        }
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public synchronized void deleteAllObserver() {
        observers.removeAllElements();
    }

    public synchronized int countObservers() {
        return observers.size();
    }
}
