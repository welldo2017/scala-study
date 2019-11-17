package com.welldo.scalaStudy.chapter4

/**
  * author: welldo 
  * date: 2019/11/17 16:17
  *
  * 练习题1: 打印1~100之间所有是9的倍数的整数的个数及总和
  *
  * 练习2: 打印出下列的语句
  * 0 + 6 = 6
  * 1 + 5 = 6
  * 2 + 4 = 6
  * *********
  * *********
  * 6 + 0 = 6
  */
object ForExercise {

  def main(args: Array[String]): Unit = {

    //1. 使用循环守卫的方式
    var sum = 0
    var count = 0
    for (elem <- 1 to 100; if elem % 9 == 0) {
      sum += elem
      count += 1
    }
    println(sum)
    println(count)


    //2. 使用引入变量的方式
    val start = 0
    val end = 6

    for (elem <- start to end; j = end - elem) {
      println(elem + "+" + j + "=" + (elem + j))
    }
    


  }


}
