package com.welldo.study.chapter8.java2;

/**
 * chapter7-abstract8 里也有介绍 抽象类
 *
 * 抽象方法必须使用abstract关键字进行修饰。
 * 如果一个类含有抽象方法，则称这个类为抽象类，抽象类必须在类前用abstract关键字修饰。
 * 如果一个类不包含抽象方法，只是用abstract修饰的话也是抽象类。也就是说抽象类不一定必须含有抽象方法。
 * <p>
 *
 * 和普通类一样，同样可以拥有成员变量和普通的成员方法。注意，抽象类和普通类的主要有三点区别：
 * 1. 抽象方法必须为public或者protected, 缺省情况下默认为public。
 * （因为如果为private，则不能被子类继承，子类便无法实现该方法）
 *
 * 2. 如果一个类继承于一个抽象类，则子类必须实现父类的抽象方法。
 * 如果子类没有实现父类的抽象方法，则必须将子类也定义为为abstract类。
 *
 * 3. 抽象类不能用来创建对象；(除非动态实现所有抽象方法, 也就是匿名子类)
 *
 * author: welldo
 * date: 2019/12/9 16:48
 */
public abstract class AbstractDoor {

     //todo 属性的修饰
     //可以有普通变量
     public String name = "门";

     abstract void open();

     abstract void close();

     //可以有普通方法
     public void alarm(){
          System.out.println("门没有关严!!!");
     }
}
