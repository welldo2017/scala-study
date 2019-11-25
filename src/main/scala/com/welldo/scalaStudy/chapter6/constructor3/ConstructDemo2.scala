package com.welldo.scalaStudy.chapter6.constructor3

/**
  * 辅助构造器
  * 辅助构造器名称为this（这个和Java不一样），
  * 多个辅助构造器通过不同参数列表进行区分， 在底层就是构造器重载，
  * 辅助构造器无论是直接或间接，最终都一定要调用主构造器，执行主构造器的逻辑，
  * 而且调用主构造器语句一定要放在辅助构造器的第一行
  *
  * author: welldo
  * date: 2019/11/23 19:21
  */
object ConstructDemo2 {
  def main(args: Array[String]): Unit = {

    //调用主构造器
    val person = new Person2
    println(person)

    //辅助构造器1
    val zhang = new Person2("zhang3")
    println(zhang)

    //辅助构造器2
    val li4 = new Person2(20)
    println(li4)

    //辅助构造器3
    val wang5 = new Person2("wang5",20)
    println(wang5)

    //编译时不会报错, 但是运行时会报错
//    val personPrivate = new PersonPrivate()
//    println(personPrivate)
  }
}
/**
  * 辅助构造器, 必须在第一行调用主构造器
  */
class Person2() {
  var name: String = _
  var age: Int = _

  def this(name : String) {
    this()  //直接调用主构造器
    this.name = name
  }

  def this(age : Int) {
    this("匿名") //简介调用主构造器,因为 def this(name : String) 中调用了主构造器!
    this.age = age
  }

  def this(name : String, age : Int) {
    this() //直接调用主构造器
    this.name = name
    this.age = age
  }

  override def toString: String = {
    "name=" + this.name + ", age=" +this.age
  }
}

//如果想让主构造器变成私有的，可以在()之前加上private，
// 这样用户不能直接通过主构造器来构造对象了
class PersonPrivate private() {

}



