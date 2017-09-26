package com.hafiz.designPattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Desc: 单例模式-登记式
 * Created by hafiz.zhang on 2017/9/26.
 */
public class Singleton4 {

    private static Map<String, Singleton4> map = new ConcurrentHashMap<>();

    protected Singleton4() {
        System.out.println("--私有化构造函数被调用--");
    }

    public static Singleton4 getInstance(String name) {
        if (name == null) {
            name = Singleton4.class.getName();
            System.out.println("--name为空，默认赋值为：--" + Singleton4.class.getName());
        }
        if (map.get(name) != null) {
            System.out.println("name对应的值存在，直接返回");
            return map.get(name);
        }
        System.out.println("name对应的值不存在，先创建，再返回");
        try {
            Singleton4 result = (Singleton4)Class.forName(name).newInstance();
            map.put(name, result);
            return result;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Map<String, Singleton4> getMap() {
        return map;
    }
}
