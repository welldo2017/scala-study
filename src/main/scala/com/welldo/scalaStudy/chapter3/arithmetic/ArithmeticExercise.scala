package com.welldo.scalaStudy.chapter3

/**
  * @author welldo 
  *         2019/11/17
  **/
object ArithmeticExercise {


  def main(args: Array[String]): Unit = {

    //假如还有97天放假，问：xx个星期零xx天
    val days = 97
    printf("距离放假还有 %d个星期零%d天\n", days / 7, days % 7)


    // 华氏温度 转换 摄氏温度的公式为：5/9*(华氏温度-100),
    // 请求出 华氏温度 232.5 对应的摄氏温度
    val huaShi = 232.5

    //错误, 因为 5/9=0, 想要得到小数点,就必须 5.0/9
    val sheShiError = 5 / 9 * (huaShi - 100)
    println(sheShiError)


    val sheShi = 5.0 / 9 * (huaShi - 100)
    println(sheShi)


  }

}
