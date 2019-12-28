package com.welldo.study.chapter7.overrideField7

/**
  * scala 字段覆写
  *
  * scala中
  * 用父类的引用去取值,会取到子类中的字段
  * 用子类的引用去取值, 会取到子类中的字段
  *
  * 因为 scala的字段, 在编译后, 生成get/set方法, 调用属性本质还是调用方法
  * 又因为遵循jvm的规范, 调用方法就要遵守 动态绑定机制,
  * 所以这里都会找到子类的属性:20
  *
  * author: welldo 
  * date: 2019/12/7 15:47
  */
object ScalaFieldOverride3 {
  def main(args: Array[String]): Unit = {
    //分别指向父类和子类
    val parent:Parent3 = new Son3
    val sun:Son3 = new Son3

    println(parent.age)//输出20
    println(sun.age)//输出20
  }

}

class Parent3{
  val  age :Int = 10
  //编译后, 生成 age()方法
  //private final int age = 10;

  //  public int age() {
  // return this.age;
  // }
}

// 如果子类中有 和父类中名字相同的字段, 必须加上override
class Son3 extends  Parent3 {
  override val  age :Int = 20
  //编译后, 生成 age()方法
  //private final int age = 20;

  //public int age() {
  // return this.age;
  // }
}
