package com.welldo.study.chapter2.dataType2

/**
  * 类型转换
  *
  * 当Scala在进行赋值或者运算时，
  * 精度小(容量小)的类型自动转换为精度大(容量大)的数据类型，这个就是自动类型转换
  *
  * 数据类型按精度(容量)大小排序, 请查看 数据类型.png
  *
  * 细节:
  *   1)有多种类型的数据混合运算时，scala自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
  *   2)当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数据类型时，就会报错；反之就会进行自动类型转换。
  *   4)byte，short，char  他们三者可以计算，在计算时首先转换为Int类型。（和java一样）
  *
  *
  * 将容量大的数据类型转换为容量小的数据类型。
  * 使用时要加上强制转函数，但可能造成精度降低或溢出,格外要注意。
  *
  * author: welldo 
  * date: 2019/11/26 14:29
  */
object TypeDemo6 {
  def main(args: Array[String]): Unit = {

    var num1: Int = 100
    var num2: Long = 100L

    //1
    val num3 = num1 + num2//num3为Long类型

    var num : Int = 2.7.toInt //强制类型转换
    println(num)

  }



}
