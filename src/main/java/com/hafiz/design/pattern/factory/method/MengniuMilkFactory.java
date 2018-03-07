package com.hafiz.design.pattern.factory.method;

import com.hafiz.design.pattern.factory.MengniuMilk;
import com.hafiz.design.pattern.factory.Milk;

/**
 * @author hafiz.zhang
 * @description: 蒙牛牛奶工厂
 * @date Created in 2018/3/5 19:13.
 */
public class MengniuMilkFactory extends AbstractFactory {

    @Override
    Milk getMilk() {
        return new MengniuMilk();
    }
}
