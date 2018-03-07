package com.hafiz.design.pattern.factory.method;

import com.hafiz.design.pattern.factory.Milk;
import com.hafiz.design.pattern.factory.YiliMilk;

/**
 * @author hafiz.zhang
 * @description: 伊利牛奶工厂
 * @date Created in 2018/3/5 19:13.
 */
public class YiliMilkFactory extends AbstractFactory {

    @Override
    Milk getMilk() {
        return new YiliMilk();
    }
}
