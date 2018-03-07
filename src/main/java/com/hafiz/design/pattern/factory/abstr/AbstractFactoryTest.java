package com.hafiz.design.pattern.factory.abstr;

import com.hafiz.design.pattern.factory.Milk;

/**
 * @author hafiz.zhang
 * @description: 抽象工厂模式测试
 * @date Created in 2018/3/5 19:24.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory starbarFactory = new StarbarFactory();
        Milk milk = starbarFactory.getMilk();
        Brand brand = starbarFactory.getBrand();
        System.out.println(milk.getName() + " 搭配 " + brand.getName());

        AbstractFactory kfcFactory = new KfcFactory();
        milk = kfcFactory.getMilk();
        brand = kfcFactory.getBrand();

        System.out.println(milk.getName() + " 搭配 " + brand.getName());

    }
}
