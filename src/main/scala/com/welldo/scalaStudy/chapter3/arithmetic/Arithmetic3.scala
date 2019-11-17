package com.welldo.scalaStudy.chapter3

/**
  * @author welldo 
  *         2019/11/17
  **/
object Arithmetic3 {

  /**
    * Scala中没有++、--操作符，需要通过+=、-=来实现同样的效果
    */
  def main(args: Array[String]): Unit = {
    var i = 10

    i += 1  //i++ 没有了
    println(i)

    i -= 1  //i-- 没有了
    println(i)

  }

}
