package com.welldo.study.chapter11.function3

/**
  * 练习1: 用reduce相关的方法, 求出 List(3,4,2,7,5)的最小值
  *
  * author: welldo 
  * date: 2019/12/21 13:23
  */
object ReduceExercise8 {
    def main(args: Array[String]): Unit = {
        val list = List(3,4,2,7,5)
        val min = list.reduceLeft(myMin _)
        println(min)

    }

    def myMin(n1:Int,n2:Int)={
        val result = n1 - n2
        if (result > 0) n2 else n1
    }

}
