package com.welldo.scalaStudy.chapter4.whileDemo

/**
  * author: welldo 
  * date: 2019/11/17 18:16
  *
  * Scala内置控制结构 特地 去掉了break和continue，
  * 是为了更好的适应函数化编程，
  * 推荐使用函数式的风格解决break和contine的功能，而不是一个关键字
  *
  * 如何捕获异常呢?
  * def breakable(op: => Unit) {
  * try {
  * op
  * } catch {
  * case ex: BreakControl =>
  * if (ex ne breakException) throw ex
  * }
  * }
  *
  * breakable 是一个函数，而且是一个高阶函数
  * 在scala中 高阶函数就是可以接收函数作为参数的函数，而且还可以返回函数
  *
  */

import scala.util.control.Breaks._

object WhileBreak2 {

  def main(args: Array[String]): Unit = {

    breakable {
      //打印1-20, 但是10以后不要打印..
      var num = 0
      while (num < 20) {
        num += 1
        printf("index = %d\n", num)

        if (num > 10) {
          //如果按照java的习惯, 写上break即可.但是scala中没有break
          //但是有break()方法, (需要导包 import  util.control.Breaks._)
          //看源码, 它会直接抛出异常, 如果异常没有被捕获, 那么最后一行代码肯定无法正常执行
          //如何捕获异常呢?
          break();
        }
      }
    }

    println("正常结束")
  }


}
