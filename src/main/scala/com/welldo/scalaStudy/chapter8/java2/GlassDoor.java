package com.welldo.scalaStudy.chapter8.java2;

/**
 * 子类使用 extends 来继承父类
 *
 * author: welldo
 * date: 2019/12/9 17:07
 */
public class GlassDoor extends AbstractDoor{
    public String name = "玻璃门";

    void open() {
        System.out.println("门儿开了");
    }

    void close() {
        System.out.println("门儿关了");
    }


}
