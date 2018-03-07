package com.hafiz.design.pattern.factory.abstr;

import com.hafiz.design.pattern.factory.Milk;

/**
 * @author hafiz.zhang
 * @description: 抽象工厂
 * @date Created in 2018/3/5 19:21.
 */
public abstract class AbstractFactory {

    abstract Milk getMilk();

    abstract Brand getBrand();
}
