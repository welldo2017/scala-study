package com.welldo.scalaStudy.chapter7.abstract8;

/**
 * 匿名子类(开发中常用)
 *     Java中: 通过包含带有定义或重写的代码块的方式, 创建一个匿名子类.(多为临时使用)
 *
 * author: welldo
 * date: 2019/12/8 12:40
 */
public class AnonymousJava2 {
    public static void main(String[] args) {

        //创建匿名子类,(匿名子类的对象, 指向父类的引用)
        AJ aj = new AJ() {
            void cry() {
                System.out.println("子类cry");
            }
        };

        //父类的引用来调用方法, (动态绑定, 所以调用的是子类的方法)
        aj.cry();
    }
}

abstract class AJ{
    abstract void cry();
}
