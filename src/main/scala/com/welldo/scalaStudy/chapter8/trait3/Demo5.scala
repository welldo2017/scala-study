package com.welldo.scalaStudy.chapter8.trait3

/**
  * 特质的底层分析2
  *
  * author welldo
  * date 2019/12/10
  */
object Demo5 {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep5
    sheep.sayHi()
    sheep.sayHello()
  }
}

/**
  * 当特质里同时有抽象方法 和 普通方法时, 可以被叫做: 富接口
  *
  * 当特质里同时有抽象方法 和 普通方法时,在底层对应两个文件
  * 1. Trait5.class ,这是接口, 里面放抽象方法,所有的方法(在这里就是sayHi和sayHelo)都会转成抽象方法
  * 那么 sayHello() 方法的实现在哪里呢?
  *
  * 2. Trait5$class.class, 这是抽象类, 里面放普通方法,  sayHello的实现在这里
  */
trait Trait5{
  def sayHi()

  def sayHello()={
    println("特质里的普通方法")
  }
}

/**
  * 底层仍然为  class sheep5 implements trait5
  * sayHi的实现, 就是普通实现方式
  * sayHello的实现, 做了一个包装, 将Trait5$class.class里的实现引用了过来
  */
class Sheep5 extends  Trait5{
  override def sayHi(): Unit = {
    println("小羊5 sayHi")
  }
}

