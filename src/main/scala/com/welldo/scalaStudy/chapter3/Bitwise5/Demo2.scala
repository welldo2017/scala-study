package com.welldo.scalaStudy.chapter3.Bitwise5

/**
  * 位运算符 涉及到的二进制相关的姿势
  * @author welldo
  *         2019/11/17
  */
object Demo2 {
  //todo
  /**
    * 原则
    * 1. 所有的运算都是以二进制补码进行.
    * 2. 二进制的最高位是符号位: 0表示正数,1表示负数
    * 3.正数的原码，反码，补码都一样
    * 4. 负数的反码=它的原码符号位不变，其它位取反(0->1,1->0)
    * 5. 负数的补码=它的反码+1
    * 6.0的反码，补码都是0
    * 7.在计算机运算的时候，都是以补码的方式来运算的，但是返回结果时，其实会将补码转成原码
    *
    * -3 & -2
    * (1)  先得到 -3 和 -2 的补码
    *
    * -3 的原码
    * 1000 0011
    * -3 的反码
    * 1111 1100
    * -3 的补码
    * 1111 1101
    *
    * -2 的原码
    * 1000 0010
    * -2的反码
    * 1111 1101
    * -2的补码
    * 1111 1110
    *
    * -3 & -2
    * 1111 1101
    * 1111 1110
    * 1111 1100 => 补码 => 反码=>原码
    *
    *
    * 反向得到反码 [补码 -1]
    * 1111 1100   - 1 => 1111 1011 =>  1000 0100 => - 4
    *
    */
  def main(args: Array[String]): Unit = {
    val res = -3 & -2 //运算一定要知道.
    println("res=" + res)

  }


}