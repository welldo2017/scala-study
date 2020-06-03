package com.welldo.study.chapter3.arithmetic1

/**
  *1)算术运算符
  * 加;（不举例）
  * 减;（不举例）
  * 乘;（不举例）
  * 除;
  * 取模(取余)
  *
  *
  * 1)对于除号“/”，它的整数除和小数除是有区别的：
  * 整数之间做除法时，只保留整数部分而舍弃小数部分。 例如：var x : Int = 10/3 ,结果是  3
  *
  * @author welldo
  *         2019/11/17
  */
object Arithmetic {

  //主要练习除法
  def main(args: Array[String]): Unit = {

    val r1 : Int = 10 / 3  // 3 [不会进行四舍五入]
    println("r1=" + r1)

    val r2 : Double = 10 / 3 // a.先得到 3;  b. 3再转成3.0
    println("r2=" + r2)

    val r3 : Double = 10.0 / 3  //[3.3333333..]
    println("r3=" + r3 )
    println("r3=" + r3.formatted("%.3f") ) // 格式化输出， 保留小数点3位，并且进行四舍五入
  }

}
