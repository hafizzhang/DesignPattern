package com.hafiz.design.pattern.singleton;

/**
 * Desc:
 * Created by hafiz.zhang on 2017/9/26.
 */
public class SingletonChild2 extends Singleton4 {

    public static SingletonChild2 getInstance() {
        return (SingletonChild2) getInstance("SingletonChild2");
    }
}
