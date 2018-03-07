package com.hafiz.design.pattern.factory.abstr;

import com.hafiz.design.pattern.factory.Milk;
import com.hafiz.design.pattern.factory.YiliMilk;

/**
 * @author hafiz.zhang
 * @description: KFC工厂（生产伊利牛奶+盼盼面包）
 * @date Created in 2018/3/5 19:23.
 */
public class KfcFactory extends AbstractFactory {

    @Override
    Milk getMilk() {
        return new YiliMilk();
    }

    @Override
    Brand getBrand() {
        return new PanpanBrand();
    }
}
