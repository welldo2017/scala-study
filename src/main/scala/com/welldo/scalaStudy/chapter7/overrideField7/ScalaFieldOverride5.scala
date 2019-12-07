package com.welldo.scalaStudy.chapter7.overrideField7

/**
  * scala 字段覆写 注意事项
  *
  * 3. var只能重写另一个抽象的var属性(案例演示)
  * 关于抽象, 后面会详讲
  *
  * 4. var 不能重写 非抽象 var(原因不讲解了, 自己做测试即可)
  *
  * author: welldo
  * date: 2019/12/7 15:47
  */
object ScalaFieldOverride5 {
  def main(args: Array[String]): Unit = {
    println("hello~")

  }

}

//抽象类
//如果一个类中有抽象的属性，则该类需要声明为抽象类
//(抽象属性：声明时,未初始化的属性就是抽象的属性)
abstract class Parent5{
  //对于抽象属性，编译后, 底层不会声明该属性, 而是生成两个抽象的方法 abstract name 和 abstract name_$eq
  var name:String
}

class Son5 extends  Parent5 {
  //复写父类的抽象属性, 本质是 实现了父类的抽象方法
  // (所以, 严谨来讲,这里应该禁止使用 override)
  override var name: String = "张三"
}
