package com.welldo.study.chapter13.highorder3

/**
  * 高阶函数:
  * 1. chapter11.introduction1.HighOrderFunction2 中提到, 能够接受函数作为参数的函数，叫做高阶函数 (higher-order function)。
  *
  * 注意:定义高级函数的时候,有def和val两种方法
  * def可以接收参数
  * val不能接受参数
  *
  * author : welldo
  * date : 2020/1/16 11:03
  */
object HighOrderFunc3 {
    def main(args: Array[String]): Unit = {
        //第一种调用方式
        println(doSquare1()(2))
        println(doSquare2(3)(3))

        //第二种调用方式,这个参数,是传给匿名函数的
        println(doSquare3(2))
    }


    //3.1 def可以接收参数, 但是不需要接收参数, 定义时()可加可不加, 调用时,传入一个参数(这个参数,是传给匿名函数的)
    def doSquare1() = {
        x: Int =>       x * x
    }

    //3.2 def可以接收参数, 且需要接收参数, 调用时,传入2个参数(1个给本函数,1个个匿名函数)
    def doSquare2(x:Int) = {
        y: Int =>       x * y
    }


    //3.3 val不能接受参数, 定义的时候, 不能加(), 调用时,传入一个参数(这个参数,是传给匿名函数的)
    val doSquare3 = {
        x: Int =>       x * x
    }

}
