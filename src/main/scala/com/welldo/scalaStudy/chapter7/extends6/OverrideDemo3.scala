package com.welldo.scalaStudy.chapter7.extends6

/**
  * scala规定，重写一个非抽象方法需要用override修饰符，
  * 如果想调用 父类中被重写的这个方法,使用super关键字去调用
  * @author welldo
  *  2019/12/4
  */
object OverrideDemo3 {
  def main(args: Array[String]): Unit = {
    val emp = new Emp
    emp.printName()
  }
}

//Person2类
class Person2 {
  var name: String = "tom"
  //父类方法
  def printName()= {
    println("父类 printName() " + name)
  }
}

class Emp extends Person2 {
  //想去重写Person-printName方法，必须显式的声明 override
  override def printName()= {
    println("子类 printName() " + name)
    //如果希望调用父类的printName,则需要使用super.printName()
    super.printName()
  }
}
