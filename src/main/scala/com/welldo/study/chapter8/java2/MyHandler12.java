package com.welldo.study.chapter8.java2;

/**
 * 子类使用implements 关键字来 实现父类
 *
 * 1. 必须实现所有方法, 否则就加上abstract 变成抽象类
 * 2. 可以实现多个 父类, 中间用逗号分隔
 *
 * author: welldo
 * date: 2019/12/9 17:33
 */
public  class MyHandler12 implements InterfaceHandler,InterfaceHandler2{

    public void beforeHandle() {
        System.out.println("方法处理前");
    }

    public void dealHandle() {
        System.out.println("方法处理ing");
    }

    public void afterHandle() {
        System.out.println("方法处理后");
    }

    public void unlessHandle() {
        System.out.println("这个方法没用, 仅仅为了演示 多实现");
    }
}
