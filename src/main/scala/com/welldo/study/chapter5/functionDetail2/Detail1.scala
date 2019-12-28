package com.welldo.study.chapter5.functionDetail2

/**
  * 1)函数的形参列表可以是多个, 如果函数没有形参，调用时 可以不带()
  *
  * 函数没有参数列表的时候, 定义时, 也可以省略()
  *
  * 函数体中如果只有一行代码, 则可以省略大括号{}
  *
  * @author welldo
  *         2019/11/21
  */
object Detail1 {

  def main(args: Array[String]): Unit = {
    test1
    test15
    test16

  }

  def test1() ={
    println("这个方法没有形参, 调用时可以不带()")
  }

  def test15 ={
    println("函数没有参数列表的时候, 定义时, 也可以省略")
  }

  def test16 =    println("函数体中如果只有一行代码, 则可以省略大括号{}")


  //函数的形参可以为多个
  def test2(name:String,age:Int)={
  }

}
