package com.welldo.study.chapter9.demo1

/**
  * 一. 隐式函数
  *
  * 请看案例:   * 高精度->低精度
  * 1. 强制转换 toInt
  * 2. 隐式转换, 关键字为: implicit,
  *     implicit 关键字告诉编译器,如果类型错误,就去找隐式函数
  *
  *     1)隐式转换与函数名称无关(就是说函数名随意)，只与函数签名（函数参数类型和返回值类型）有关。
  *     也就是说, 同一功能的隐式函数, 只能有一个. 有多个就会报错.
  *
  * author: welldo 
  * date: 2019/12/28 14:57
  */
object ImplicitDemo2 {
    def main(args: Array[String]): Unit = {

        //使用隐式函数
        //反编译后, 底层会生成一个方法:  doubleToInt$1()
        implicit def doubleToInt(d:Double): Int = d.toInt

        //写上隐式函数后, 代码不再报错.
        val num : Int = 1.1     //底层编译: doubleToInt$1(1.1)
        val num2:Int = 2.2      //底层编译: doubleToInt$1(2.2)

        println(num)
        println(num2)
    }
}
