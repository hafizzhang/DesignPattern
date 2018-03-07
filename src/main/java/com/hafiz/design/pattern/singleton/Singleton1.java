package com.hafiz.design.pattern.singleton;

/**
 * Desc: 单例模式-饿汉式
 * Created by hafiz.zhang on 2017/9/26.
 */
public class Singleton1 {

    // 创建全局静态变量，保证只有一个实例
    private static Singleton1 instance  = new Singleton1();

    private Singleton1() {
        // 构造函数私有化
        System.out.println("--调用饿汉式单例模式的构造函数--");
    }

    public static Singleton1 getInstance() {
        System.out.println("--调用饿汉式单例模式的静态方法返回实例--");
        return instance;
    }
}
