package com.welldo.study.chapter13.highorder3

/**
  * 高阶函数:
  * 1. chapter11.introduction1.HighOrderFunction2 中提到, 能够接受函数作为参数的函数，叫做高阶函数 (higher-order function)。
  *
  *
  * author : welldo 
  * date : 2020/1/16 11:03
  */
object HighOrderFunc1 {

    def main(args: Array[String]): Unit = {

        //这里sum 为何不传参数, 请参考 chapter11.introduction1.HighOrderFunction2
        val res = test(sum, 6.0)
        println("res=" + res)
    }

    //1. test就是高阶函数
    def test(f: Double => Double, n1: Double) = {
        f(n1)
    }
    def sum(d: Double): Double = {
        d + d
    }
}
