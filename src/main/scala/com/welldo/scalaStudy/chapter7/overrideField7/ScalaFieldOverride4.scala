package com.welldo.scalaStudy.chapter7.overrideField7

/**
  * scala 字段覆写 注意事项
  *
  * 1. val只能重写另一个val 属性, 不能重写var
  *   原因:
  *     父类 var name 在编译后, 生成 get set方法, 也就是 public name / public name_$eq
  *     子类 val name 在编译后, 只有get方法, 也就是 public name
  *     val son = new Son
  *     son.name = "jack" //只能调用父类的方法
  *     son.name  //调用子类的方法,
  *     所以, 数据访问会不一致, 所以编译器会报错, 这里不做演示.
  *
  * 2. 可以重写不带参数的 同名 def (请看演示)
  *
  * author: welldo
  * date: 2019/12/7 15:47
  */
object ScalaFieldOverride4 {
  def main(args: Array[String]): Unit = {
    val son:Son4 = new Son4
    println(son.age)

    //仍然遵循动态绑定机制
    val parent:Parent4 = new Son4
    println(parent.age )
    println(parent.age() )
  }

}

class Parent4{
  def age():Int ={
    return 10
  }
}

class Son4 extends  Parent4 {
  // 编译器会生成 get方法, 也就是 public age()
  override val  age :Int = 20
}
