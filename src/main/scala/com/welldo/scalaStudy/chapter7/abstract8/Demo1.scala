package com.welldo.scalaStudy.chapter7.abstract8

/**
  * 在Scala中，通过abstract关键字标记 抽象类。
  *
  * 0. 抽象类不能被实例 (除非动态实现所有抽象方法)
  * 1. 方法不用标记 abstract，只要省掉方法体即可。(写上abstract, 编译时不报错, 运行时报错)
  * 2. 抽象字段/属性就是没有初始值的字段
  * 3. 抽象类可以 只有普通字段, 只有抽象字段, 可以普通+ 抽象字段, 但是只要有抽象字段, 就必须是抽象类
  * 4. 抽象类可以 只有普通方法, 只有抽象方法, 可以普通+ 抽象方法, 但是只要有抽象方法, 就必须是抽象类
  *
  * 子类规范
  *     如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法和抽象属性，除非它自己也声明为abstract类。
  *     抽象方法和抽象属性不能使用private、final 来修饰，因为这些关键字都是和重写/实现相违背的
  *
  * 抽象类的价值:
  *   更多是在于设计，是设计者设计好后，让子类继承并实现抽象类
  *
  * author: welldo
  * date: 2019/12/7 16:58
  */
object Demo1 {

    //0. 不能实例化
  //new Animal()

}

//抽象类
 abstract class Animal {
  var name: String //抽象的字段
  var age: Int // 抽象的字段
  var color: String = "black" //普通字段

  def cry() //抽象方法

  //非抽象方法
  def sayOk(): Unit = {
    println("ok")
  }
}