package com.welldo.study.chapter13.closure5

/**
  * 闭包: closure
  * (闭包是一种语法现象, 并不是scala独有, 详情请查看百度百科)
  *  "闭包就是能够读取其他函数内部变量的函数", 也就是说, 闭包是一种函数.
  *
  *
  * author : welldo 
  * date : 2020/1/17 15:23
  */
object ClosureDemo1 {
    def main(args: Array[String]): Unit = {
        // chapter13.highorder3.HighOrderFunc2 为闭包的初体验

        //调用minus, 传入值为20, 返回了一个匿名函数,名为 f20
        // 此匿名函数为(y: Int) => x - y, 也即 (y: Int) => 20 - y
        //那么, 在f20的生命周期内, x 永远等于20
        // 匿名函数 与 x 组成了一个整体, 构成了一个闭包
        val f20 = minus(20)

        println(f20(1))// 20-1 =19
        println(f20(8)) //20-8=12

        //可以这样理解，此匿名函数是一个对象，而x就是该对象的一个字段，他们共同形成一个闭包
        //(在f20的生命周期内, x 永远等于20)
        //当多次调用f20这个对象,（可以理解为 多次调用闭包），因为x是字段, 所以x不变。
    }


    // 返回一个匿名函数
    def minus(x: Int) = {
        (y: Int) => x - y
    }

}
