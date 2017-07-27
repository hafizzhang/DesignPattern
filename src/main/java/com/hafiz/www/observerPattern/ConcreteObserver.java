package com.hafiz.www.observerPattern;

/**
 * Desc:具体观察者实现类
 * Created by hafiz.zhang on 2017/7/27.
 */
public class ConcreteObserver implements Observer {
    private String status;

    @Override
    public void update(Observable obj, Object args) {
        System.out.println("Observable:" + obj.getClass().getName() + " status has changed");
        this.status = (String)args;
        System.out.println("After changed ConcreteObserver`s status is : " + status);
    }
}
