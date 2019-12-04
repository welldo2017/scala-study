package com.welldo.scalaStudy.chapter7.extends6

/** Scala中类型检查和转换
  * 1).classOf获取对象的类名。(也可以用反射机制: 对象.getClass.getClassName)
  *
  * 2)obj.isInstanceOf[T]就如同Java的obj instanceof T ,判断obj是不是T类型。返回boolean
  * 3)obj.asInstanceOf[T]就如同Java的(T)obj, 将obj强转成T类型。
  *
  * @author welldo
  *         2019/12/4
  */
object TypeConvert4 {
  def main(args: Array[String]): Unit = {
    // 获取对象类型
    println(classOf[String])

    val s = "zhang3"
    println(s.getClass.getName) //反射方式
    println(s.isInstanceOf[String]) //判断类型 true


    //看一个简单应用
    val p: Person3 = new Emp3 //子类对象给了一个父类的引用
    p.printName()

    //如果希望使用的子类的方法say
    p.asInstanceOf[Emp3].say()
  }
}

class Person3 {
  var name = "king"
  def printName(): Unit = {
    println("name=" + name)
  }
}

class Emp3 extends Person3 {

  def say(): Unit = {
    println("Emp3=" + name)
  }
}
