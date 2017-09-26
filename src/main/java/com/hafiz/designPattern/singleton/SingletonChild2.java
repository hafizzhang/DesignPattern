package com.hafiz.designPattern.singleton;

/**
 * Desc:
 * Created by hafiz.zhang on 2017/9/26.
 */
public class SingletonChild2 extends Singleton4 {

    public static SingletonChild2 getInstance() {
        return (SingletonChild2) Singleton4.getInstance("com.hafiz.designPattern.singleton.SingletonChild2");
    }
}
