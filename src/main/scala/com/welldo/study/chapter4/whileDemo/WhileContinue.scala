package com.welldo.study.chapter4.whileDemo

/**
  * author: welldo 
  * date: 2019/11/17 18:16
  *
  * Scala内置控制结构 特地 去掉了break和continue，
  * 是为了更好的适应函数化编程，
  * 推荐使用函数式的风格解决break和contine的功能，而不是一个关键字
  *
  * 使用循环守卫, 实现continue
  *
  */

object WhileContinue {

  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3 if i != 2) {
      println(i )
    }
  }


}
