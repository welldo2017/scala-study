package com.welldo.study.chapter7.visit5

/**
  * 可见性的前置知识
  *
  * //说明一下伴生类和伴生对象关系
  * //1. 如果我们在同一个文件中，写了 class PreVisit 和  object PreVisit
  * //   就把 class Clerk 称为 伴生类， object Clerk 称为伴生对象
  *
  * //2. 如果我们在同一个文件中，只写了 class PreVisit ，那么Clerk就是一个普通的类
  *
  * //3. 如果我们在同一个文件中，只写了 object Clerk,
  * 那么在底层就会自动生成对应的伴生类 class Clerk, 只是这个伴生类是空..
  *
  * //4. 伴生对象，可以访问到伴生类的 任何 方法和属性 (注意: 是任何)
  *
  * 为什么要这样设计???
  * 因为scala设计者,认为 static 不是面向对象,但是要和jvm无缝接轨,所以做了一些转变, 设计了伴生概念
  * 伴生类: 放非静态内容******
  * 伴生对象: 放静态内容******
  *
  * @author welldo
  *  2019/12/02
  */

//伴生对象
object PreVisit0 {
  def main(args: Array[String]): Unit = {
    val visit = new PreVisit0
    //3. 伴生对象可以访问私有属性
    visit.sal
    visit.sal = 666.66

    //4. protected ,伴生对象可以用
    visit.job
  }

}

//伴生类
class PreVisit0 {
  //var name , 底层 name是private ,但是会提供两个public方法 name name_$eq, 处处可用
  var name: String = "jack"

  //4. protected为受保护权限，scala中受保护权限比Java中更严格，只能本类, 子类 和伴生对象 访问
  //todo 子类还没有做演示
  protected var job : String = "大数据工程师"

  //3. private为私有权限，只在本类和伴生对象中可用
  private var sal: Double = 9999.9

  //如果方法默认就是public
  def showInfo(): Unit = {
    println(" name " + name + " sal= " + sal)

    //4. protected ,本类可用
    println(job)
  }
}

//非伴生类
object notPreVisit0 {
  def main(args: Array[String]): Unit = {
    //3. 非伴生对象, 不可以访问私有属性
    val visit = new PreVisit0
    //    visit.sal

    //4. protected 其他地方不可用
    //    visit.job

  }

}

