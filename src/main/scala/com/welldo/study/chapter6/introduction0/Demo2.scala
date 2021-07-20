package com.welldo.study.chapter6.introduction0

/**
  * 1)属性的定义语法同变量，
  *   示例：[访问修饰符] var 属性名称 [：类型] = 属性值
  *
  * 3)Scala中声明一个属性,必须显示的初始化;
  *   初始化时, 可以根据属性值自动推断属性类型, 属性类型可以省略 [：类型]
  *
  * 4)如果不为Null类型的属性，要想赋值为null,则一定要加类型，不能使用自动推断;
  *   因为不加类型, 那么该属性的类型,就会被自动推断为Null类型.
  *
  * author: welldo 
  * date: 2019/11/23 17:12
  */
object Demo2 {
  def main(args: Array[String]): Unit = {
    val detail = new ClassDetail

    println(detail.name)//String类型的null
    println(detail.age.getClass)
    println(detail.address)//Null类型的null
  }

}

class ClassDetail{
  var age = 25//3.

  var name: String = null//4.

  var address = null//4.
}
