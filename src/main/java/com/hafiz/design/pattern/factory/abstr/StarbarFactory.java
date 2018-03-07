package com.hafiz.design.pattern.factory.abstr;

import com.hafiz.design.pattern.factory.Milk;
import com.hafiz.design.pattern.factory.TelunsuMilk;

/**
 * @author hafiz.zhang
 * @description: 星巴克工厂（生产特仑苏牛奶+达利园面包）
 * @date Created in 2018/3/5 19:22.
 */
public class StarbarFactory extends AbstractFactory {

    @Override
    Milk getMilk() {
        return new TelunsuMilk();
    }

    @Override
    Brand getBrand() {
        return new DaliyuanBrand();
    }
}
