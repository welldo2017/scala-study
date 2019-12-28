package com.welldo.study.chapter8.java2;

/**
 * 在软件工程中，接口泛指供别人调用的方法或者函数。
 * 从这里，我们可以体会到Java语言设计者的初衷，它是对行为的抽象
 * <p>
 *
 * 声明接口
 *      interface 接口名
 * 实现接口 (一个类可以实现多个接口)
 *      class 类名 implements 接口名1，接口2
 * <p>
 *
 * 1. 接口中可以含有变量和方法, 但是要注意，
 *      变量会被隐式地指定为 public static final(也就是常量), 并且只能是
 *      方法会被隐式地指定为 public abstract(也就是抽象方法) , 并且只能是(java8及其以后, 可以非抽象)
 *
 * 2. 在Java中，接口之间支持多继承
 *
 * author: welldo
 * date: 2019/12/9 17:24
 */
public interface InterfaceHandler {

    String name = "接口";


    void beforeHandle();

    void dealHandle();

    void afterHandle();
}
