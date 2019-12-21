package com.welldo.scalaStudy.chapter11.function3

/**
  * 练习2:
  * reduceRight:
  *
  * author: welldo 
  * date: 2019/12/21 13:23
  */
object ReduceExercise9 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4 ,5)

        // (((1- 2)-3)- 4)-5 = -13
        println(list.reduceLeft(minus))

        //step1: 4-5, 得到a       -1
        //step2: 3-a, 得到b       4
        //step3: 2-b, 得到c       -2
        //step4: 1-c, 得到最终答案 3
        println(list.reduceRight(minus))

        // 看源码, reduce 就是reduceLeft
        println(list.reduce(minus))
    }

    def minus( num1 : Int, num2 : Int ): Int = {
        num1 - num2
    }

}
