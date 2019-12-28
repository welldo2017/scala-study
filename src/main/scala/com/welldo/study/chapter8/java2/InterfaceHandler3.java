package com.welldo.study.chapter8.java2;

/**
 * 测试: 在Java中，接口之间支持多继承
 * InterfaceHandler3 继承了InterfaceHandler, 一共4个方法
 * <p>
 * author: welldo
 * date: 2019/12/9 17:24
 */
public interface InterfaceHandler3 extends InterfaceHandler {

    String name = "接口2";

    void unlessHandle();

}
