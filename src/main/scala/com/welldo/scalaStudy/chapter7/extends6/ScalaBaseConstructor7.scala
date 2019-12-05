package com.welldo.scalaStudy.chapter7.extends6

/**
  * scala的构造器
  *
  * 1. 类有一个主构器和任意数量的辅助构造器，
  * 而每个辅助构造器都必须先调用主构造器(也可以是间接调用)，
  * 这点在chapter6.constructor3 里面讲过.
  *
  * 2.只有主构造器可以调用父类的构造器。辅助构造器不能直接调用父类的构造器。
  * 在Scala的构造器中，你不能调用super(params)
  *
  * author: welldo
  * date: 2019/12/5 11:36
  */
object ScalaBaseConstructor7 {
  def main(args: Array[String]): Unit = {
    //scala会先构建父类部分
    new Emp5()
  }
}

//父类
class Person5(name: String) {
  println("Person5 主构造器" + name)
}

//子类
// 将子类参数传递给父类构造器,这种写法√
class Emp5 (name: String) extends Person5(name) {

  println("子类的主构造器=" + name)

  //super(name), 错误不能在主构造器中显式的调用super

  def  this() {
    this("xx")
    //super("abc") // (×)不能在辅助构造器中调用显式父类的构造器
  }
}
