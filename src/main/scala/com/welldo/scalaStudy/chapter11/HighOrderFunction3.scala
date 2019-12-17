package com.welldo.scalaStudy.chapter11

/**
  * 要求：请将List(3,5,7) 中的所有元素都 * 2 ，
  * 将其结果放到一个新的集合中返回，即返回一个新的List(6,10,14),
  *
  * map()的定义: def map[B, That](f: A => B)
  * map()的参数是:  f:int => B 的函数(B 是泛型)
  * 所以我们需要 手动写一个函数, 接收int参数, 返回值为泛型B, 也就是任意
  *
  * 170 结束
  *
  * author welldo
  * date 2019/12/17
  */
object HighOrderFunction3 {
  def main(args: Array[String]): Unit = {

    //2. 非传统
    val list = List(3,5,7)

    //map() 做了什么事儿
    //1. 将list中的元素, 依次遍历
    //2. 依次放入到 muliple() 函数中, 并返回一个int (就是说, 有几个元素就调用几次muliple)
    //3. 将得到的int, 依次放入到新的list 中
    val newList = list.map(muliple _)
    println(newList)

  }

  //f:int => B
  def muliple(n:Int)={
    2*n
  }

}
