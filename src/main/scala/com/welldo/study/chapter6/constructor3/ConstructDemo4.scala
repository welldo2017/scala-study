package com.welldo.study.chapter6.constructor3

import scala.beans.BeanProperty

/**
  *JavaBeans规范定义了Java的属性是像getXxx（）和setXxx（）的方法。
  * 许多Java工具（框架）都依赖这个命名习惯。
  * 将Scala字段加@BeanProperty时，这样会自动生成规范的 setXxx/getXxx 方法。
  * 这时可以使用 对象.setXxx() 和 对象.getXxx() 来调用属性。
  *
  * 之前的
  * 赋值方式:对象.属性 = xxx
  * 取值方式: 对象.属性
  * 仍然有效, 不会冲突
  *
  * author: welldo
  * date: 2019/11/23 19:21
  */
object ConstructDemo4 {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "奔驰" //底层是 car.name.$eq()
    println(car.name) //底层使用的是car.name()

    car.setName("路虎")
    println(car.getName)
  }
}

class Car{
  @BeanProperty var name:String = _
}

