package com.welldo.scalaStudy.chapter4.whileDemo

/**
  * author: welldo 
  * date: 2019/11/17 18:16
  *
  * 20以内的数求和，求出 当和 第一次大于20的当前数是多少?
  * 请使用循环守卫和breakable，完成break的效果
  */

import scala.util.control.Breaks._

object WhileBreakExercise {

  def main(args: Array[String]): Unit = {

    //方法1: 普通方法, 使用break() 进行中断
    var sum = 0
    breakable {
      for (elem <- 1 to 20) {
        sum += elem
        if (sum > 20) {
          printf("累计求和第一次大于20的当前数是%d \n", elem)
          break()
        }
      }
    }

    println("==============================")
    //方法2: 循环守卫
    var sum2 = 0
    var loop = true
    for (elem <- 1 to 20 if loop) {
      sum2 += elem
      if (sum2 > 20) {
        printf("累计求和第一次大于20的当前数是%d \n", elem)
        loop = false
      }

      //elem =6 的时候, 累计和就超过20了, 那么 6以后的循环, 还会进来空转吗?
      //不会的,编译器很聪明的, 我们可以用下面这行代码进行验证
      println(elem)
    }


  }


}
