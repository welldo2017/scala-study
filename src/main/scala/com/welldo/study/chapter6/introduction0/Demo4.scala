package com.welldo.study.chapter6.introduction0

/**
  * 基本语法
  * val | var 对象名 [：类型]  = new 类型()
  *
  * 说明
  * 1)如果我们不希望改变对象的引用(即：内存地址), 应该声明为val 性质的，否则声明为var,
  *   scala设计者推荐使用val ,因为一般来说，在程序中，我们只是改变对象属性的值，而不是改变对象的引用。
  *
  * 2)scala在声明对象变量时，可以根据创建对象的类型自动推断，所以类型声明可以省略，
  *   但当类型和后面new 对象类型有继承关系即多态时，就必须写了
  *
  * author: welldo 
  * date: 2019/11/23 17:40
  */
object Demo4 {

  def main(args: Array[String]): Unit = {

    //这里使用的是自动推导
    val emp = new Emp

    //编译类型就是Person
    val emp1: Person = new Emp
  }
}

class Person{
}

class Emp extends Person{
}
