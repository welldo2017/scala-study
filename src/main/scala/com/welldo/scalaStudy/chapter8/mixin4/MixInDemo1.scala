package com.welldo.scalaStudy.chapter8.mixin4

/**
  * 动态混入(mix in)
  * 动态混入是Scala特有的方式（java没有动态混入），
  * 可在不修改类声明/定义的情况下，扩展类的功能，非常的灵活，耦合性低
  * 3种情况, 普通类, 抽象类(无抽象方法), 抽象类(有抽象方法)
  * 1. 新建对象时, 在后面跟上 with 特质名: new mysql with dbInsert
  * 2. 同上
  * 3. 新建对象时, 在后面跟上 with 特质名 {}, 大括号中为抽象方法的实现
  *
  * @author welldo
  * date 2019/12/11
  */
object MixInDemo1 {
    //在不修改下面3个类的前提下, 使用 trait dbInset 中的方法
  def main(args: Array[String]): Unit = {
    val mysql = new mysql with dbInsert
    mysql.inset(1)

    val oracle = new oracle with dbInsert
    oracle.inset(2)

    val hbase = new hbase with dbInsert {
      override def connectDB(): Unit = {
        println("连接habse成功")
      }
    }
    hbase.connectDB()
    hbase.inset(3)
  }
}

trait dbInsert{
  def inset(id:Int)={
    println("插入的数据主键为:"+id)
  }
}

//1.普通类
class mysql{}

//2. 抽象类(无抽象方法)
abstract class oracle{}

//3. 抽象类
abstract class hbase{  def connectDB() }





