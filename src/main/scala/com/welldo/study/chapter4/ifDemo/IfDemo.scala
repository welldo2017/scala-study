package com.welldo.study.chapter4.ifDemo

/**
  * author: welldo
  *
  * 1)如果大括号{}内的逻辑代码只有一行，大括号可以省略, 这点和java 的规定一样。
  *
  * 2)Scala中任意表达式都是有返回值的，
  * 也就意味着if else表达式其实是有返回结果的，具体返回结果的值取决于满足条件的代码体的最后一行内容.[案例演示]
  *
  * 3)Scala中是没有三元运算符，因为可以这样简写,使用 if -- else
  */
object IfDemo {

  def main(args: Array[String]): Unit = {

    //1
    if (true) {
      println("ok")
    }

    if (true)
      println("一样ok")

    //2
    var result = if(true){
      "valj"
      "true"
    }else{
      7
      "false"
    }
    println(result)

    //3. Scala不支持java中的三目运算符 (n1 > n2 ? n1 : n2),
    // 在Scala 中使用 if – else 的方式实现。
    val n1 = 20
    val n2 = 40
    val max = if (n1 > n2)  n1 else n2
    println("max=" + max)
  }

}
