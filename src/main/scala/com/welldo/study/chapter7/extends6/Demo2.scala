package com.welldo.study.chapter7.extends6

/**
  * 子类继承了所有的属性(通过方法)，只是私有的属性不能直接访问，
  * 需要通过公共的方法去访问
  * 【debug代码验证可以看到】
  *
  * @author welldo
  *  2019/12/4
  */
object Demo2 {
  def main(args: Array[String]): Unit = {
    val sub = new Sub()
    //打断点可以看到，子类继承了所有属性，但是private的属性没有权限访问
    sub.sayOk()
    sub.test100()

    //todo 子类继承父类的方法 的规则?
//    sub.test200()
//    sub.test300()
  }
}


//父类
class Base {
  //三种属性
  var n1: Int = 1
  protected var n2: Int = 2
  private var n3: Int = 3

  //方法
  def test100(): Unit = {
    println("base 100")
  }

  protected def test200(): Unit = {
    println("base 200")
  }

  private def test300(): Unit = {
    println("base 300")
  }
}

//子类Sub继承了Base父类
class Sub extends Base {
  //方法
  def sayOk(): Unit = {
    //这里子类中，可以访问到父类的 默认和protected的属性和方法
    this.n1 = 20 // n1_$eq()
    this.n2 = 40 //...
    //this.n3 = 90
    println("范围\t" + this.n1 +"\t"+ this.n2)

    test100()
    test200()//本类,子类和伴生对象能访问--protected
//    test300()//本类和伴生对象访问-- private
  }
}
