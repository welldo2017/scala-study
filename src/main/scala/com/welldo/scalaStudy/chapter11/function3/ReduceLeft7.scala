package com.welldo.scalaStudy.chapter11.function3

/**
  * 递归思想的函数之一: reduce
  * def reduceLeft[B >: A] (f: (B, A) => B): B
  * reduceLeft接收两个参数, 运算后得到的结果, 和第3个参数继续运算,
  * 运算后得到的结果, 和4个参数继续运算....以此类推
  *
  * tips: 上述高阶函数的参数样式, 以后遇到类似的, 则执行流程也差不多
  *
  * 需求
  * val list = List(1, 20, 30, 4 ,5) , 求所有元素的和.
  * author welldo
  * date 2019/12/18
  */
object ReduceLeft7 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 20, 30, 4 ,5)

    //运算流程;
    //step1: 1 + 20, 得到a
    //step2: a + 30, 得到b
    //step3: b + 4, 得到c
    //step4: c + 5, 得到最终答案d
    val res = list.reduceLeft(sum _)
    println("res=" + res)

  }

  def sum(n1:Int,n2:Int): Int = {
    println("sum函数被调用")
    n1 + n2
  }

}
