package com.welldo.study.chapter5.function1

/*
  * *****方法的调用机制
  * 详细请看示意图  方法的调用机制.png
  *
  * 1.当程序执行一个函数/方法时, 会开辟一个独立的栈(即相互的数据独立)
  * 2.当遇到return或者执行完成, 会返回到调用的位置
  *
  * author: welldo 
  * date: 2019/11/17 19:26
  */
object FunctionCalling2 {

  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 3
    val res = sum(n1, n2)
    println("res=" + res)
  }

  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }


}
