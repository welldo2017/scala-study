package com.welldo.scalaStudy.chapter4.ForDemo

/**
  * author: welldo 
  * date: 2019/11/17 16:17
  */
object ForDemo3 {

  /**
    * 循环嵌套
    */
  def main(args: Array[String]): Unit = {

    //这个无法处理复杂的业务
    println("嵌套循环=================")
    for(i <- 1 to 3; j <- 1 to 3) {
      println(" i =" + i + " j = " + j)
    }


    //复杂的业务时,推荐使用这个
    println("普通方式=================")
    for (i <- 1 to 3) {
      for (j <-1 to 3) {
        println(" i =" + i + " j = " + j)
      }
    }


  }


}
