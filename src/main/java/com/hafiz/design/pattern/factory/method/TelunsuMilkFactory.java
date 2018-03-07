package com.hafiz.design.pattern.factory.method;

import com.hafiz.design.pattern.factory.Milk;
import com.hafiz.design.pattern.factory.TelunsuMilk;

/**
 * @author hafiz.zhang
 * @description: 特仑苏牛奶工厂
 * @date Created in 2018/3/5 19:12.
 */
public class TelunsuMilkFactory extends AbstractFactory {

    @Override
    Milk getMilk() {
        return new TelunsuMilk();
    }
}
