package com.welldo.scalaStudy.chapter9.demo1

/**
  * 高精度->低精度
  * 1. 强制转换 toInt
  * 2. 隐式转换, 关键字为: implicit,
  *     implicit 关键字告诉编译器,如果类型错误,就去找隐式函数
  *
  * author: welldo 
  * date: 2019/12/28 14:57
  */
object ImplicitDemo2 {
    def main(args: Array[String]): Unit = {

        //使用隐式函数
        //反编译后, 底层会生成一个方法:  doubleToInt$doubleToInt()
        implicit def doubleToInt(d:Double): Int = d.toInt

        //写上隐式函数后, 代码不再报错.
        val num : Int = 1.1     //底层编译: doubleToInt$doubleToInt(1.1)
        val num2:Int = 2.2      //底层编译: doubleToInt$doubleToInt(2.2)

        println(num)
        println(num2)
    }
}
