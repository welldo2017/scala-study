package com.welldo.scalaStudy.chapter4

/**
  * author: welldo 
  * date: 2019/11/17 16:17
  *
  * 循环返回值
  * 将遍历过程中处理的结果, 放到一个Vector集合中(indexedSeq[T])
  * yield 后可以跟上代码块
  */
object ForDemo4 {

  def main(args: Array[String]): Unit = {

    val res = for (i <- 1 to 10) yield i
    println(res)

    val res2 = for (i <- 1 to 10) yield i * 2
    println(res2)

    //yield 后可以跟上代码块
    val res3 = for (i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      } else {
        "不是偶数"
      }
    }
    println(res3)


  }


}
