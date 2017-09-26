package com.hafiz.designPattern.singleton;

/**
 * Desc:
 * Created by hafiz.zhang on 2017/9/26.
 */
public class Singleton4Child1 extends Singleton4 {

    public static Singleton4Child1 getInstance() {
        return (Singleton4Child1) Singleton4.getInstance("com.hafiz.designPattern.singleton.Singleton4Child1");
    }
}
