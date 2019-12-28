package com.welldo.study.chapter4.ForDemo

/**
  * author: welldo 
  * date: 2019/11/17 16:17
  *
  * 循环时控制步长
  */
object ForDemo5{

  def main(args: Array[String]): Unit = {

    //默认, 步长为1
    for (elem <- 1 to 10) {
      print(elem+", ")
    }

    println()
    //步长为3, range方式
    //特别注意: 这个range 相当于until
    for (elem <- Range(1,10,3)) {
      print(elem+", ")
    }

    println()
    //步长为3, for循环守卫方式: if i % 3 == 1
    for (elem <- 1 to 10; if elem %3 ==1) {
      print(elem+", ")
    }


  }


}
