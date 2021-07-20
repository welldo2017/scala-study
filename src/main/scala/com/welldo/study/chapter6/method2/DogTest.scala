package com.welldo.study.chapter6.method2

/**
  * Scala 有方法与函数，二者在语义上的区别很小。
  * 方法是类的一部分，  * 而函数是一个对象,可以赋值给一个变量。
  *
  * 换句话来说在类中定义的函数即是方法。  * 所以方法很简单, 这里只举一个例子即可
  *
  * author: welldo 
  * date: 2019/11/23 19:05
  */
object DogTest {

  def main(args: Array[String]): Unit = {
    //创建一只狗
    val dog = new Dog
    dog.name = "tom"
    dog.age = 10
    dog.weight = 50

    println(dog.say())
  }
}


//类中声明一个say方法
class Dog {
  var name: String = ""
  var age: Short = 0
  var weight: Float = 0.0f

  def say(): String = {
    s"小狗的信息如下\t ${name} \t ${age} \t ${weight}"
  }
}


