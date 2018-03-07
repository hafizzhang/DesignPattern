package com.hafiz.design.pattern.factory.method;

import com.hafiz.design.pattern.factory.Milk;

/**
 * @author hafiz.zhang
 * @description: 工厂方法模式测试类
 * @date Created in 2018/3/5 19:14.
 */
public class factoryMethodTest {

    public static void main(String[] args) {
        // 获取蒙牛牛奶
        AbstractFactory mengniuFactory = new MengniuMilkFactory();
        Milk milk = mengniuFactory.getMilk();
        System.out.println(milk.getName());

        // 获取特仑苏牛奶
        AbstractFactory telunsuFactory = new TelunsuMilkFactory();
        Milk telunsuMilk = telunsuFactory.getMilk();
        System.out.println(telunsuMilk.getName());
    }
}
