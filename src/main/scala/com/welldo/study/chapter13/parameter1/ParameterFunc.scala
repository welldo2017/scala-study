package com.welldo.study.chapter13.parameter1

/**
  * 作为参数的函数
  *
  * 请参考 chapter11.introduction1.HighOrderFunction3
  *
  * @author welldo
  * date 2020/1/14
  */
object ParameterFunc {
  def main(args: Array[String]): Unit = {
    val list = List(3,5,7)

    // HighOrderFunction3 中的代码, 这里的下户线 代表函数的引用
    val newList = list.map(muliple _)
    println(newList)


    //作为参数的函数
    //这里的下划线, 就是代表 遍历出来的每个元素, 然后传给muliple()方法
    val list2 = list.map(muliple(_))
    println(list2)

    //简写, 省略括号 和 下划线
    val list3 = list.map(muliple)
    println(list3)

    //既然是参数, 就一定有类型: <function1> (有两个参数, 就是<function2> , 以此类推)
    println("函数的类型:" + muliple _)

  }

  def muliple(n:Int)={
    2*n
  }

}
