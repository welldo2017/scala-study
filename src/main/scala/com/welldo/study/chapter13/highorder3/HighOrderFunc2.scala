package com.welldo.study.chapter13.highorder3

/**
  * 高阶函数:
  * 1. chapter11.introduction1.HighOrderFunction2 中提到, 能够接受函数作为参数的函数，叫做高阶函数 (higher-order function)。
  *
  * 2. 并且:
  * 高阶函数可以返回一个匿名函数.
  *
  * author : welldo 
  * date : 2020/1/16 11:03
  */
object HighOrderFunc2 {
    def main(args: Array[String]): Unit = {
        //调用minus, 返回匿名函数(分步)
        val f1 = minus(10)

        println("分步调用======")
        // 在f1 (y: Int) => x - y 的生命周期内, x永远等于10 (涉及到闭包的概念, 请查看 chapter13.closure5.ClosureDemo1 )
        val i = f1(1) // 10-1
        println(i)

        val i2 = f1(5) // 10-5
        println(i2)

        println("一次性调用======")
        val i3 =  minus(10)(5)// 10-5
        println(i3)
    }


    // 2. minus() 返回了一个匿名函数
    def minus(x: Int) = {

        // 匿名函数的 函数表达式
        (y: Int) => x - y
    }
}
