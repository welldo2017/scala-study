package com.welldo.scalaStudy.chapter5.exception5

/**
  * 自定义异常
  *
  * author: welldo
  * date: 2019/11/23 14:58
  */
object ExceptionDemo3 {

  def main(args: Array[String]): Unit = {
    f11()
  }

  //等同于NumberFormatException.class
  @throws(classOf[NumberFormatException])
  def f11()  = {
    "abc".toInt
  }

}
