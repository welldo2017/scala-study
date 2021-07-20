package com.welldo.study.chapter6.constructor3

/**
  * Scala类的构造器包括： 主构造器（一个） 和 辅助构造器(多个)
  *
  * Scala构造器的基本语法:
  * class 类名(形参列表) {              // 主构造器
  *     def  this(形参列表) {  。。。}   // 辅助构造器的名字为 this
  * }
  *
  * author: welldo 
  * date: 2019/11/23 19:21
  */
object ConstructDemo1 {
  def main(args: Array[String]): Unit = {
    val person = new Person1("jack",20)
    println(person)

    //如果主构造器无参数，小括号可省略，构建对象时调用的构造方法的小括号也可以省略
    val personWithout = new PersonWithout
  }
}

//Scala构造器作用是完成对新对象的初始化，构造器没有返回值。
class Person1(pName: String, pAge: Int) { //1.主构造器, 直接放置于类名之后
  var name: String = pName
  var age: Int = pAge

  override def toString: String = {
    "name=" + this.name + ", age=" +this.age
  }
}

//如果主构造器无参数，小括号可省略，构建对象时调用的构造方法的小括号也可以省略
class PersonWithout {
  var name: String = _
  var age: Int = _
}

