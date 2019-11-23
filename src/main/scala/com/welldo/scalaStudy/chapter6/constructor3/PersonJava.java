package com.welldo.scalaStudy.chapter6.constructor3;

/**
 * 构造器(constructor)又叫构造方法，是类的一种特殊的方法，它的主要作用是完成对新对象的初始化。
 * <p>
 * 1)在Java中一个类可以定义多个不同的构造方法，构造方法重载
 * <p>
 * 2)如果没有定义构造方法，系统会自动给类生成一个默认无参构造方法(也叫默认构造器)，比如 Person (){}
 * <p>
 * 3)一旦定义了自己的构造方法（构造器）,默认的构造方法就覆盖了，就不能再使用默认的无参构造方法，
 * 除非显式的定义一下,即:  Person(){};
 * <p>
 * author: welldo
 * date: 2019/11/23 19:10
 */
public class PersonJava {

    public String name;
    public int age;

    public PersonJava() {
    }

    public PersonJava(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
