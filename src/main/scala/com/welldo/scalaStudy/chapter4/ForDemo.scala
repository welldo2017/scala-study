package com.welldo.scalaStudy.chapter4

/**
  * author: welldo 
  * date: 2019/11/17 16:17
  */
object ForDemo {

  /**
    * 1) i 表示要循环的变量，
    * 2) <- 表示把 集合中的值,依次交给前面的变量
    *
    * 3) to 是关键字,   x to y,表示从x到y ,左闭右闭
    *   until 是关键字, x to y,表示从x到y ,左闭右开
    *
    * 4) i将会从 1开始循环,到3结束
    * 5) 这里的 1 to 3 也可以是一个集合
    */
  def main(args: Array[String]): Unit = {

    //左闭右闭
    for (i <- 1 to 5) {
      println("to: " + i)
    }

    //左闭右开
    for (i <- 1 until  5) {
      println("until: " + i)
    }


  }


}
