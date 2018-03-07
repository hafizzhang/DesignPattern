package com.hafiz.design.pattern.factory.simple;

import com.hafiz.design.pattern.factory.MengniuMilk;
import com.hafiz.design.pattern.factory.Milk;
import com.hafiz.design.pattern.factory.TelunsuMilk;
import com.hafiz.design.pattern.factory.YiliMilk;

/**
 * @author hafiz.zhang
 * @description: 牛奶简单工厂
 * @date Created in 2018/3/5 17:48.
 */
public class MilkFactory {

    public static Milk getMilk(String name) {
        if ("telunsu".equals(name)) {
            return new TelunsuMilk();
        }
        if ("mengniu".equals(name)) {
            return new MengniuMilk();
        }
        if ("yili".equals(name)) {
            return new YiliMilk();
        }
        System.out.println("暂无您需要的牛奶：" + name);
        return null;
    }
}
