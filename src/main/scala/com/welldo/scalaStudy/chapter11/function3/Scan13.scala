package com.welldo.scalaStudy.chapter11.function3

/**
  * scan 的练习
  *
  * author: welldo 
  * date: 2019/12/21 14:54
  */
object Scan13 {
    def main(args: Array[String]): Unit = {
        //(3)
        //(3, 3*1)
        //(3, 3, 3*2)
        //(3, 3, 6, 6*3) = (3,3,6,18)
        val seq = (1 to 3).scanLeft(3)(multiply _)
        println(seq)
    }

    def multiply(a: Int, b: Int) = a * b

}
