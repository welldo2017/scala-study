package com.welldo.study.chapter7.overrideField7;

/**
 * java 动态绑定机制
 * 当对象调用方法的时候，该方法会和该对象的内存地址绑定
 * 划重点: 看内存地址即可
 *
 * 1.先运行, 看输出什么: 40,30
 *      因为内存地址是B类, 所以调用B的sum()和sum1()
 * 2.注释 class B的sum()方法, 看输出什么: 30,30
 *      只剩下A有sum()方法, 所以调用A的sum(), 此方法又调用getI(), 和上述一致,内存地址是B类,所以调用B的getI()
 * 3.注释 class B的sum1()方法, 看输出什么: 30,20
 *      和上述一致
 *
 * @author welldo
 * @date 2019/12/5
 */
public class JavaDynamicBind2 {
    public static void main(String[] args) {
        //子类对象地址, 交给父类的引用
        A a = new B();
        System.out.println(a.sum());
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
