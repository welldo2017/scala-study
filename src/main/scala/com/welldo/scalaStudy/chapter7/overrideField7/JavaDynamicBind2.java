package com.welldo.scalaStudy.chapter7.overrideField7;

/**
 * java 动态绑定机制
 *
 * 1. 先运行, 看输出什么,40,30
 * 2.注释 class B的sum()方法, 看输出什么,30,30
 * 3.注释 class B的sum1()方法, 看输出什么,30,20
 *
 * //动态绑定机制
 * 1. 当对象调用方法的时候，该方法会和该对象的内存地址绑定【这个就是动态绑定机制】
 * 2. 当对象调用属性，没有动态绑定机制，在哪里调用，就返回哪里的值
 *
 * @author welldo
 * @date 2019/12/5
 */
public class JavaDynamicBind2 {
    public static void main(String[] args) {
        //子类对象地址, 交给父类的引用
        A a = new B();
        //40 -》 30
        System.out.println(a.sum());
        //30 -> 20
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;
    public int sum() {
        return getI() + 10;
    }
    public int sum1() {
        return i + 10;
    }
    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;
    // @Override
    // public int sum() {
    //     return i + 20;
    // }
    @Override
    public int getI() {
        return i;
    }
    // @Override
    // public int sum1() {
    //     return i + 10;
    // }
}
