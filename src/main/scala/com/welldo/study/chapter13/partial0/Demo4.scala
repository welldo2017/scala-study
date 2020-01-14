package com.welldo.study.chapter13.partial0

/**
  * 4. 偏函数的简写
  * (偏函数是一个特质: PartialFunction)
  *
  * 把大括号内的一组case语句封装为函数，我们称之为偏函数，
  * 它只对会对 指定类型的参数 或 在指定范围内的参数 ,实施计算，其他值会忽略.
  *
  * author : welldo 
  * date : 2020/1/14 18:07
  */
object Demo4 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "abc")

    //创建一个偏函数
    val pf = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = {        x.isInstanceOf[Int]      }

      override def apply(v1: Any): Int = {        v1.asInstanceOf[Int] + 1      }
    }
    val list2 = list.collect(pf)
    println(list2)

    /**
      * 简写 (写成方法的形式)
      * Any为输入, int为输出
      * 遍历所有any, 如果这个any为int, 就执行 => 后面的逻辑
      */
    def pf2() : PartialFunction[Any,Int] ={
      case i:Int => i +1
    }
    val list3 = list.collect(pf2)
    println(list3)

    /**
      * 第二种简写形式
      * 直接将 自定义的方法, 写入到 collect{} 中
      * 此例子中, 输入输出都是 any
      */
    val list4 = list.collect {
      case i: Int => i + 1
      case j: String => "welldo"
    }
    println(list4)

  }

}
