package com.hafiz.www.observerPattern;

/**
 * Desc:具体主题实现类
 * Created by hafiz.zhang on 2017/7/27.
 */
public class ConcreteSubject extends Observable {
    private String status = "originalStatus";

    public ConcreteSubject(Observer observer) {
        // 注册观察者
        addObserver(observer);
    }

    public void changeStatus(String status) {
        System.out.println("Before changed ConcreteSubject`s status is : " + this.status);
        this.status = status;
        System.out.println("After changed ConcreteSubject`s status is : " + this.status);
        setChanged();
        notifyObservers(this.status);
    }
}
