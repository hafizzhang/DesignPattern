package com.hafiz.www;

import com.hafiz.designPattern.observer.ConcreteObserver;
import com.hafiz.designPattern.observer.ConcreteSubject;
import com.hafiz.designPattern.singleton.Singleton1;
import com.hafiz.designPattern.singleton.Singleton2;
import com.hafiz.designPattern.singleton.Singleton3;
import com.hafiz.designPattern.singleton.Singleton4;
import com.hafiz.designPattern.singleton.Singleton4Child1;
import com.hafiz.designPattern.singleton.SingletonChild2;
import org.junit.Test;

import java.util.Map;

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

    @Test
    public void testSingleton1() {
        System.out.println("-----------------测试饿汉式单例模式开始--------------");
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println("第二次获取实例");
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println("instance1和instance2是否为同一实例?" + (instance1 == instance2));
        System.out.println("-----------------测试饿汉式单例模式结束--------------");
    }

    @Test
    public void testSingleton2() {
        System.out.println("-----------------测试懒汉式单例模式开始--------------");
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println("第二次获取实例");
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println("instance1和instance2是否为同一实例?" + (instance1 == instance2));
        System.out.println("-----------------测试懒汉式单例模式结束--------------");
    }

    @Test
    public void testSingleton3() {
        System.out.println("-----------------测试改进懒汉式单例模式开始--------------");
        Singleton3 instance1 = Singleton3.getInstance();
        System.out.println("第二次获取实例");
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println("instance1和instance2是否为同一实例?" + (instance1 == instance2));
        System.out.println("-----------------测试改进懒汉式单例模式结束--------------");
    }

    @Test
    public void testSingleton4() {
        System.out.println("-----------------测试登记式单例模式开始--------------");
        System.out.println("第一次取得实例");
        Singleton4 instance1 = Singleton4.getInstance(null);
        System.out.println("res:" + instance1);
        System.out.println("第二次获取实例");
        Singleton4Child1 instance2 = Singleton4Child1.getInstance();
        System.out.println("res:" + instance2);
        System.out.println("第三次获取实例");
        SingletonChild2 instance3 = SingletonChild2.getInstance();
        System.out.println("res:" + instance3);
        System.out.println("第四次获取实例");
        SingletonChild2 instance4 = new SingletonChild2();
        System.out.println("res:" + instance4);
        System.out.println("输出父类Map中所有的单例");
        Map<String, Singleton4> map = instance1.getMap();
        for (Map.Entry<String, Singleton4> item : map.entrySet()) {
            System.out.println("map-item:" + item.getKey() + "=" + item.getValue());
        }
        System.out.println("instance1和instance2是否为同一实例?" + (instance1 == instance2));
        System.out.println("-----------------测试登记式单例模式结束--------------");
    }
}
