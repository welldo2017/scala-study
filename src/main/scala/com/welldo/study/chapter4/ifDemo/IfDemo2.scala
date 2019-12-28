package com.welldo.study.chapter4.ifDemo

/**
  * author: welldo
  *
  * 2)Scala中任意表达式都是有返回值的，
  * 也就意味着if else表达式其实是有返回结果的，具体返回结果的值取决于满足条件的代码体的最后一行内容.[案例演示]
  */
object IfDemo2 {

  def main(args: Array[String]): Unit = {

    //这时,没有进入到if的逻辑中, 则会返回 Unit的实例: () 一对小括号
    val age = 10
    val result = if (age > 18) {
      "已经成年"
    }

    println("result= " + result)
  }

}
