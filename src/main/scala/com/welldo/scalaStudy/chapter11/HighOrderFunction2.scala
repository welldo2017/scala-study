package com.welldo.scalaStudy.chapter11

/**
  * 何为高阶函数, 后面会详讲, 这里先简单介绍
  *
  * author: welldo 
  * date: 2019/12/15 14:29
  */
object HighOrderFunction2 {
    def main(args: Array[String]): Unit = {

    }

    // test函数, 接收一个类型为 f: Double => Double 的函数作为参数
    def test(f: Double => Double, n1: Double) = {
        f(n1)
    }

    def sum(d: Double): Double = {
        d + d
    }

}
