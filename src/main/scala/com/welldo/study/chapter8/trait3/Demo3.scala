package com.welldo.study.chapter8.trait3

/**
  * 特质的快速入门
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
