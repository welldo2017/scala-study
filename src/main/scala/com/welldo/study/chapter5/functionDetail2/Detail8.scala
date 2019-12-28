package com.welldo.study.chapter5.functionDetail2

/**
  * 8)Scala语法中任何的语法结构都可以嵌套其他语法结构(灵活)，
  * 即：函数中可以再声明/定义函数，类中可以再声明类
  *
  * @author welldo
  *         2019/11/21
  */
object Detail8 {

  def main(args: Array[String]): Unit = {

    //这个方法在编译的时候, 会被提到外面, 和 sayHi()平级,
    //只不过是 private final 级别的
    def dsfasdf(): Unit ={
      println("sdsfsd")
    }

    //并且还能定义同名函数
    //在编译的时候, 会被编译成 private final sayHi$1 (), 避免冲突
    //todo 调用时的顺序, 后面再讲
    def sayHi(): Unit ={
      println("hi from main")
    }

    sayHi()
  }

  def sayHi(): Unit ={
    println("hi")
  }



}