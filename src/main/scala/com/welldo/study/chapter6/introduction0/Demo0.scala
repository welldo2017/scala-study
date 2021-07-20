package com.welldo.study.chapter6.introduction0

/**
  * author: welldo
  * date: 2019/11/23 16:14
  */
object Demo0 {

  def main(args: Array[String]): Unit = {

    val cat = new Cat
    //调用编译后的 public get方法
    printf("%s,%d,%s",cat.name,cat.age,cat.color)
    println()

    //开始赋值(调用编译后的 public set方法)
    cat.name="小白"
    cat.age=10
    cat.color="write"
    printf("%s,%d,%s",cat.name,cat.age,cat.color)
  }
}

/**
  * 定义一个类  * 声明属性的时候, 必须要给初始值
  * 编译后, 生成一个public的 class文件
  */
class Cat {
  var name: String = "小黄"//对于每个属性,会生成 private 类型 属性名,会生成一对 public get set 方法
  var age: Int = 5
  var color: String = "yellow"
}
