package com.welldo.scalaStudy.chapter3.arithmetic

/**
  * @author welldo 
  *         2019/11/17
  *
  *         运算符是一种特殊的符号，用以表示数据的运算、赋值和比较等。
  *         1)算术运算符
  *
  *         3)比较运算符(关系运算符), 最后返回boolean,不举例
  *         4)逻辑运算符【与，或，非】,最后返回boolean,不举例
  *
  *         2)赋值运算符
  *         5)位运算符 (位运算 ~  |   >> << >>>...)
  **/
object Arithmetic {

  //主要练习除法
  def main(args: Array[String]): Unit = {

    val r1 : Int = 10 / 3  // 3 [不会进行四舍五入]
    println("r1=" + r1)

    val r2 : Double = 10 / 3 // a.先得到 3;  b. 3再转成3.0 】
    println("r2=" + r2)

    val r3 : Double = 10.0 / 3  //[3.3333333..]
    println("r3=" + r3 )
    println("r3=" + r3.formatted("%.3f") ) // 格式化输出， 保留小数点3位，并且进行四舍五入
  }

}
