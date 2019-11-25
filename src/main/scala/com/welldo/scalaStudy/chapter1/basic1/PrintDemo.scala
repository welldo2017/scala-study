package com.welldo.scalaStudy.chapter1.basic1

/**
  * Scala语言输出的三种方式
  * 1)字符串通过+号连接（类似java）。
  * 2)printf用法, 字符串通过 % 传值。
  *     s代表String, d代表数字, f代表flout/double
  *
  * 3)Println用法, 字符串通过$引用(类似PHP）。
  *     $紧跟变量名即可, ${变量名}还可以对变量进行运算
  *
  * @author welldo
  *  2019/11/25
  */
object PrintDemo {

  def main(args: Array[String]): Unit = {
    val name:String = "tom"
    val age:Int = 10
    val heigh:Double = 175.5

    //第一种方式
    println("name=" +name +",age=" +age +",heigh=" +heigh)

    //第二种方式(%f默认保留6位小数)
    printf("name=%s, age=%d, heigh=%f\n",name,age,heigh)
    //手动保留2位小数
    printf("name=%s, age=%d, heigh=%.2f\n",name,age,heigh)

    //第三种
    println(s"name=$name, age=$age, heigh=$heigh, 10年后年龄=${age+10}")

  }

}
