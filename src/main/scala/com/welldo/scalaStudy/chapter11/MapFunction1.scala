package com.welldo.scalaStudy.chapter11

/**
  * 要求：请将List(3,5,7) 中的所有元素都 * 2 ，
  * 将其结果放到一个新的集合中返回，即返回一个新的List(6,10,14),
  *
  * author: welldo
  * date: 2019/12/15 13:57
  */
object MapFunction1 {
    def main(args: Array[String]): Unit = {
        //1. 传统实现方法
        val list = List(3,5,7)
        var newList = List[Int]()
        for (elem <- list) {
            newList = newList :+ elem * 2
        }
        println(newList)

        //2. 非传统
        //引出 map函数, 此函数是高阶函数
        // (能接收函数作为参数的函数,叫做高阶函数, 请看示例  HighOrderFunction1



    }
}
