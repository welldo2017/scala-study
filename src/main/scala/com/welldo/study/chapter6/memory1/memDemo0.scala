package com.welldo.study.chapter6.memory1

/**
  * scala 的内存分配和java一致
  * 引用放在栈内存, 指向堆内存
  *
  *
  * author: welldo 
  * date: 2019/11/23 17:51
  */
object memDemo0 {

  def main(args: Array[String]): Unit = {
    val person1 = new Person
    person1.name = "jack"
    person1.age = 20

    val person2 = person1
    person2.name = "rose"
    person2.age = 25

    println(person1.name)
    println(person1.age)

  }

}


class Person {
  var name: String = _
  var age: Int = _
}
