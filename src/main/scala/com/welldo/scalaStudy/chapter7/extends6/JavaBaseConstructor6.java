package com.welldo.scalaStudy.chapter7.extends6;

/**
 * 回顾-Java中超类的构造
 *
 * 1)从代码可以看出：在Java中，创建子类对象时，子类的构造器总是去调用一个父类的构造器
 * (显式或者隐式调用)。
 *
 * 2)java的子类可以指定使用父类的哪个构造器完成初始化. 如果不指定,则使用无参构造器
 *
 * @author welldo
 * @date 2019/12/4
 */
public class JavaBaseConstructor6 {
    public static void main(String[] args) {
        // 先输出A(), 再输出B()
        B b = new B();

        B b2 = new B("zhang3");
    }
}

class A {
    public A() {
        //super(); 这里也隐藏了去调用object的方法
        System.out.println("A()");
    }
    public A(String name) {
        System.out.println("A(String name)" + name);
    }
}
class B extends A{
    public B() {
        //这里会隐式调用super(); 就是无参的父类构造器A()
        // super();
        System.out.println("B()");
    }
    public B(String name) {
        super(name);//如果不指定, 则默认调用父类的无参构造器
        System.out.println("B(String name)" + name);
    }
}

