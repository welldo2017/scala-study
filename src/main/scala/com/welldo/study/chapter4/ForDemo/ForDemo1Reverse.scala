package com.welldo.study.chapter4.ForDemo

/**
  * 反转 reverse 方法
  *
  * author: welldo 
  * date: 2019/11/23 18:27
  */
object ForDemo1Reverse {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,3)
    println(list)
    println(list.reverse)

    for (i <- 1 to 5 reverse) {
      println("to: " + i)
    }

  }

}
