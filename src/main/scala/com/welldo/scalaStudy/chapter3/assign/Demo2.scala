package com.welldo.scalaStudy.chapter3.assign

/**
  * @author welldo 
  *         2019/11/17
  *
  *         赋值运算符
  */
object Demo2 {

  def main(args: Array[String]): Unit = {

    //有两个int变量, a和b, 要求将其进行交换, 但是不允许使用中间变量
    var a = 10
    var b = 20

    //方法1
    a = a + b //10+20
    b = a - b //10 + 20-20
    a = a - b //10 + 20 -10
    printf("a=%d, b=%d\n", a, b)

    //方法2(位运算符)
    //todo


  }


}
