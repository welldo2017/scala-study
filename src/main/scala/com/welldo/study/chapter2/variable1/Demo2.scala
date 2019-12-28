package com.welldo.study.chapter2.variable1

/**
  *  var 修饰的对象引用可以改变
  * val 修饰的对象引用不可改变，
  * 但对象的状态(值)却是可以改变的。(比如: 自定义对象、数组、集合等等)
  *
  * @author welldo
  *  2019/11/25
  */
object Demo2 {
  def main(args: Array[String]): Unit = {
    //创建一个对象
    //1. dog 是val 修饰的，即dog对象是不可变，即dog的引用不可变
    //2. 但是 dog.name是 var, 他的属性可变
    val dog = new Dog
//    dog = null //报错
    dog.name = "大黄狗"
    dog.name = "大黄狗2"


//    var 修饰的对象引用可以改变
    var dog2 = new Dog
    dog2 = null  //不报错
  }

}

class Dog {
  var name = "tom"
}
