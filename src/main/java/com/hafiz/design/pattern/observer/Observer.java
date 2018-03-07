package com.hafiz.design.pattern.observer;

/**
 * Desc:观察者接口
 * Created by hafiz.zhang on 2017/7/27.
 */
public interface Observer {

    /**
     * 已订阅的主题发生改变时调用此方法来更新自己
     *
     * @param obj 当前正在发生改变的可观察者对象
     *
     * @param args 参数
     */
    void update(Observable obj, Object args);
}
