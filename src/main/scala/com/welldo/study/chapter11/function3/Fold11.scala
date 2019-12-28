package com.welldo.study.chapter11.function3

/**
  * 简写方式
  *     foldLeft   /:
  *     foldRight :\
  * 了解即可, 别人这么写的时候, 能看懂就行.
  *
  * author: welldo
  * date: 2019/12/21 13:50
  */
object Fold11 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 10)
        //两种写法等价
        val res = (1 /: list)(minus _)
        val res2 = list.foldLeft(1)(minus _)
        println(res)
        println(res2)

        val a = (list :\ 1) (minus _)
        val b = list.foldRight(1)(minus _)
        println(a)
        println(b)
    }

    def minus(num1: Int, num2: Int): Int =  num1 - num2
}
