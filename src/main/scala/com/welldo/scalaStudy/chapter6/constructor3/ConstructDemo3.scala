package com.welldo.scalaStudy.chapter6.constructor3

/**
  *构造器参数
  *
  * 1)Scala类的主构造器的形参未用任何修饰符修饰，那么这个参数是局部变量。
  *
  * 2)如果参数使用val关键字声明，那么Scala会将参数作为类的 私有的 只读属性 使用(反编译查看)
  *
  * 3)如果参数使用var关键字声明，那么Scala会将参数作为类的 私有的 成员属性 使用,(反编译查看)
  *   并会提供对应的get set 方法，
  *
  * author: welldo
  * date: 2019/11/23 19:21
  */
object ConstructDemo3 {
  def main(args: Array[String]): Unit = {

    val person31 = new Person31("zhang3")
    //person31. 无法调用name属性, 因为仅仅是个局部变量

    val person32 = new Person32("li4")
    person32.name     //可以get
    //person32.name = "sss"   //无法重新赋值, 因为只读

    val person33 = new Person33("wagnd5")
    person33.name = "sss"   //可以重新赋值

  }
}

class Person31(name:String) {

}

class Person32(val name:String) {

}

class Person33(var name:String) {

}





