package com.welldo.scalaStudy.chapter11.function3

/**
  * fold / foldLeft / foldRight
  * 同理: fold = foldLeft
  *
  * 方法定义:     foldLeft[B](z: B)(op: (B, A) => B): B
  *     先有一个初始值z: B,
  *     再有一个 函数op, 格式为(B, A) => B
  *     相当于给reduceLeft 函数, 在最左边多加了一个 初始值
  *
  *     所以,  reduceLeft 是简化版的 foldLeft。
  *
  * author: welldo
  * date: 2019/12/21 13:47
  */
object Fold10 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4)

        // List(1, 2, 3, 4).fold(5)(minus _),
        //把初始值5, 放到 list的最左边.
        //即 List(5,1, 2, 3, 4).reduceLeft(minus _)
        val result = list.fold(5)(minus _)
        println(result)

        // foldLeft = fold
        println(list.foldLeft(5)(minus _))

        //把初始值5, 放到 list的最右边.
        //即 List(1, 2, 3, 4, 5).reduceRight(minus _), 得到
        println(list.foldRight(5)(minus _))
    }

    def minus(num1: Int, num2: Int): Int =  num1 - num2
}
