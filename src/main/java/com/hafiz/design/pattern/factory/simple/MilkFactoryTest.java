package com.hafiz.design.pattern.factory.simple;

import com.hafiz.design.pattern.factory.Milk;

/**
 * @author hafiz.zhang
 * @description:
 * @date Created in 2018/3/5 18:33.
 */
public class MilkFactoryTest {

    public static void main(String[] args) {
        // 蒙牛牛奶
        Milk mengniu = MilkFactory.getMilk("mengniu");
        System.out.println(mengniu.getName());

        // 伊利牛奶
        Milk yili = MilkFactory.getMilk("yili");
        System.out.println(yili.getName());
    }
}
