package com.welldo.scalaStudy.chapter11.introduction1

/**
  * 要求：请将List(3,5,7) 中的所有元素都 * 2 ，
  * 将其结果放到一个新的集合中返回，即返回一个新的List(6,10,14),
  *
  * map()的定义: def map[B, That](f: A => B)
  * map()的参数是: 接受一个值,返回一个值的函数 即可
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
    //2. 依次放入到 muliple() 函数中, 运算后返回一个值 (就是说, 有几个元素就调用几次muliple)
    //3. 将运算得到的值, 依次放入到新的list 中,
    //4. 最终返回新的list
    val newList = list.map(muliple _)
    println(newList)

  }

  //接受一个值,返回一个值的函数 即可; 这里我们定义为接收int,返回int
  def muliple(n:Int)={
    2*n
  }

}
