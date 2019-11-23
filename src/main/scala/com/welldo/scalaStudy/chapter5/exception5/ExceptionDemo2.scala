package com.welldo.scalaStudy.chapter5.exception5

/**
  * 自定义异常
  *
  * author: welldo
  * date: 2019/11/23 14:58
  */
object ExceptionDemo2 {

  def main(args: Array[String]): Unit = {
    val res = try {
      test()
    } catch {
      case ex:Exception => println("捕获到了一个异常")
    }

    println("继续执行")

  }


  //3)用throw关键字，抛出一个异常对象。所有异常都是Throwable的子类型。
  // throw表达式是有类型的，就是Nothing，因为Nothing是所有类型的子类型，所以throw表达式可以用在需要类型的地方
  def test(): Nothing = {
    throw new Exception("不对")
  }
}
