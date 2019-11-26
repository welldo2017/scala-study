package com.welldo.scalaStudy.chapter3.input6

import scala.io.StdIn

/**
  * @author welldo 
  *         2019/11/17
  *         在编程中，需要接收用户输入的数据，就可以使用键盘输入语句来获取。InputDemo.scala
  */
object InputDemo {

  //要求：可以从控制台接收用户信息，【姓名，年龄，薪水】。
  def main(args: Array[String]): Unit = {

    //直接调用StdIn 这个object的静态方法。
    println("请输入name")
    val name = StdIn.readLine()

    printf("请输入年龄(int类型)")
    val age = StdIn.readInt()

    printf("请输入薪水(double类型)")
    val salary = StdIn.readDouble()

    printf("用户信息为 name=%s, age=%d, salary=%.2f",name,age,salary)

  }

}
