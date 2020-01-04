package com.welldo.study.chapter11.function5

/**
  * Parallel 并行计算
  *
  * 应用案例2
  *
  * author: welldo 
  * date: 2020/1/4 17:45
  */
object Parallel6 {
    def main(args: Array[String]): Unit = {

        // 一个core计算, 输出结果肯定是 有序的
        (1 to 10).foreach(println)
        println("========")

        //多个core , 串行计算, 输出结果可能无序,
        (1 to 10).par.foreach(println)

    }

}
