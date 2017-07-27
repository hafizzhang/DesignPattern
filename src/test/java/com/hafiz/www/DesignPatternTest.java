package com.hafiz.www;

import com.hafiz.www.observerPattern.ConcreteObserver;
import com.hafiz.www.observerPattern.ConcreteSubject;
import org.junit.Test;

/**
 * Desc:设计模式demo单元测试类
 * Created by hafiz.zhang on 2017/7/27.
 */
public class DesignPatternTest {

    @Test
    public void testObserverPattern() {
        ConcreteObserver observer = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject(observer);
        subject.changeStatus("new Status");
    }
}
