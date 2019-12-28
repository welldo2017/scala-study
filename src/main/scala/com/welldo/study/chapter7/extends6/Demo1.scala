package com.welldo.study.chapter7.extends6

/**
  *继承可以解决代码复用,让我们的编程更加靠近人类思维.
  * 当多个类存在相同的属性(变量)和方法时,
  * 可以从这些类中抽象出父类(比如Student),在父类中定义这些相同的属性和方法，
  *
  * 子类不需要重新定义这些属性和方法，只需要通过extends语句来声明继承父类, 即可获得
  * 子类只需要定义自己特有的属性和方法 即可
  *
  * @author welldo
  *         2019/12/2
  */
object Demo1 {


}

//是一个Person类
class Person {
  var name : String = "jack" //private [public方法]
  var age : Int = _ //private [public 方法]
  def showInfo(): Unit = { //public 方法
    println("学生信息如下：")
    println("名字：" + this.name)
  }
}

class Student extends Person {
  def studying(): Unit = {
    //调用父类的属性
    //this.name 本质是 this.name()
    println(this.name + "学习 scala中....")
  }
}
