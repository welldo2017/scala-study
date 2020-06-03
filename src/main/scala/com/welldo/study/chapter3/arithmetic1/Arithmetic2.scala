package com.welldo.study.chapter3.arithmetic1

/**
  * 主要练习 取模(取余)
  * 当对一个数取模时，可以等价 a%b = a - a/b * b
  * (和java 的取模规则一样)。
  *
  * author welldo
  * 2019/11/17
  */
object Arithmetic2 {

  def main(args: Array[String]): Unit = {

    //取模
    println("res0=" + 10 % 3) // 1
    println("res0=" + -10 % 3) // => -10 - (-10)/3 * 3  => -10 - (-9) = -1
    println("res0=" + -10 % -3) // =>-10 - (-10)/(-3) * -3 =>-10 - (-9) = -1
    println("res0=" + 10 % -3) //  =>10 - (10)/(-3) * -3 => 10 - 9 = 1
  }

}
