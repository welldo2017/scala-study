package com.welldo.scalaStudy.chapter5.functionDetail2

/**
  * 1)函数的形参列表可以是多个, 如果函数没有形参，调用时 可以不带()
  * @author welldo
  *         2019/11/21
  */
object Detail1 {

  def main(args: Array[String]): Unit = {
    test1

  }

  def test1() ={
    println("这个方法没有形参, 调用时可以不带()")
  }


  def test2(name:String,age:Int)={
    //函数的形参可以为多个
  }

}
