package com.welldo.study.chapter4.ForDemo

/**
  * 字符串的本质, 是字符数组
  *
  * author: welldo 
  * date: 2019/11/23 18:39
  */
object ForDemo11 {

  def main(args: Array[String]): Unit = {
    for ( elem <- "hello"){
      println(elem)
    }

  }

}
