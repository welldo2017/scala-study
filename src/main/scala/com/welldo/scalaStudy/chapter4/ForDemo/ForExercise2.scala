package com.welldo.scalaStudy.chapter4.ForDemo

/**
  * author: welldo 
  * date: 2019/11/17 16:17
  *
  * 练习题3: 打印九九乘法表
  */
object ForExercise2 {

  def main(args: Array[String]): Unit = {

    val start = 1
    val num = 9

    //循环嵌套
    for (elem <- start to num; j <- start to elem) {
      printf("%d * %d = %d \t", elem, j, elem * j)

      //换行控制
      if (j == elem) {
        println()
      }
    }


  }


}
