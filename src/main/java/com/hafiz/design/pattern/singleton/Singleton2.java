package com.hafiz.design.pattern.singleton;

/**
 * Desc:单例模式-懒汉式
 * Created by hafiz.zhang on 2017/9/26.
 */
public class Singleton2 {

    // 创建全局静态变量，保证只有一个实例
    private static Singleton2 instance = null;

    // 构造函数私有化
    private Singleton2() {
        System.out.println("--调用懒汉式单例模式的构造方法--");
    }

    public static Singleton2 getInstance() {
        System.out.println("--调用懒汉式单例模式获取实例--");
        if (instance != null) {
            System.out.println("--懒汉式单例实例已经创建,直接返回--");
            return instance;
        }
        synchronized (Singleton2.class) {
            System.out.println("--懒汉式单例实例未创建,先创建再返回--");
            instance = new Singleton2();
        }
        return instance;
    }
}
