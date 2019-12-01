package com.welldo.scalaStudy.chapter7.visit5

/**
  * 在Java中，访问权限分为: public，private，protected和默认。
  * 在Scala中，你可以通过类似的修饰符达到同样的效果。
  * 但是使用上有区别
  *
  *
  *
  * Scala中包的可见性和访问修饰符的使用
  * 1)当属性访问权限为默认时，从底层看属性是private的，但是因为提供了xxx_$eq()[类似setter]/xxx()[类似getter] 方法，因此从使用效果看是任何地方都可以访问)
  * 2)当方法访问权限为默认时，默认为public访问权限
  * 3)private为私有权限，只在类的内部和伴生对象中可用 【案例演示】
  * 4)protected为受保护权限，scala中受保护权限比Java中更严格，只能子类访问，同包无法访问 (编译器从语法层面控制)
  * 5)在scala中没有public关键字,即不能用public显式的修饰属性和方法。
  *
  * 6)小结
  * scala设计者将访问的方式分成三大类:
  * (1) 处处可以访问public
  * (2) 子类和伴生对象能访问protected
  * (3) 本类和伴生对象访问 private
  *
  * 7)包访问权限（表示属性有了限制。同时包也有了限制），这点和Java不一样，体现出Scala包使用的灵活性。 当然，也可以将可见度延展到上层包private[atguigu] val description="zhangsan"说明：private也可以变化，比如protected[atguigu], 非常的灵活.
  *
  * @author welldo
  *  2019/12/01
  */
object TestVisit {
  //todo 没测试

}
