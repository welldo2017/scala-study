package com.welldo.study.chapter3.assign4

/**
  * 赋值运算符
  * @author welldo
  *         2019/11/17
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

  }


}
