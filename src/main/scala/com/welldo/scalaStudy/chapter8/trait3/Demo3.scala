package com.welldo.scalaStudy.chapter8.trait3

/**
  * 特质的快速入门
  * (可以把特质可以看作是对继承的一种补充)
  *
  * Scala的继承是单继承,
  * 也就是一个类最多只能有一个父类,这种单继承的机制可保证类的纯洁性。
  * 但对子类功能的扩展有一定影响.
  *
  *     A类     增加一个功能     D类
  *    /   \    /      \      /   \
  *   /     \  /        \    /     \
  * B类     c类           E类       F类
  *
  * author: welldo
  * date: 2019/12/8 17:29
  */
object Demo3 {
  def main(args: Array[String]): Unit = {
    //使用
    val c = new C
    val e = new E
    c.getConnect()
    e.getConnect()
  }
}

//定义一个连接数据库的特质
trait connDB{
  def getConnect()
}

class A{}
class B extends A{}
class C extends A with connDB {
  override def getConnect(): Unit = println("connect mysql success")
}

class D{}
class E extends D with connDB {
  override def getConnect(): Unit = println("connect oracle success")
}
class F extends D{}
