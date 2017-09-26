package com.hafiz.designPattern.singleton;

/**
 * Desc:单例模式-改进懒汉式
 * Created by hafiz.zhang on 2017/9/26.
 */
public class Singleton3 {
    private static class Singleton4 {
        private static Singleton3 instance;
        static {
            System.out.println("--类级内部类被加载--");
            instance = new Singleton3();
        }
        private Singleton4() {
            System.out.println("--调用类级内部类的构造函数--");
        }
    }
    private Singleton3() {
        System.out.println("--调用构造函数--");
    }
    public static Singleton3 getInstance() {
        System.out.println("--开始调用共有方法返回实例--");
        Singleton3 instance;
        System.out.println("---------------------------");
        instance = Singleton4.instance;
        System.out.println("返回单例");
        return instance;
    }
}
