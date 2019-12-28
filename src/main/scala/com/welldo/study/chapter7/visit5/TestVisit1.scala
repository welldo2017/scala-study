package com.welldo.study.chapter7.visit5

/**
  * 在Java中，访问权限分为: public，private，protected和默认。
  *
  * Scala中包的可见性和访问修饰符的使用
  * 1)当属性访问权限为默认时，从底层看, 属性是private的，
  * 但是因为提供了setter/getter 方法，因此从使用效果看是任何地方都可以访问)
  *
  * 2)当方法访问权限为默认时，默认为public访问权限
  *
  * 3)private时，只在本类和伴生对象中可用 【案例演示 见PreVisit0】
  *
  * 4)protected为受保护权限，scala中受保护权限比Java中更严格，只能子类访问
  *
  * 5)在scala中没有public关键字
  *
  * 6)小结  * scala设计者将访问的方式分成三大类:
  * (1) 处处可以访问--public(默认)
  * (2) 本类,子类和伴生对象能访问--protected
  * (3) 本类和伴生对象访问-- private
  *
  * 7)包访问权限（表示属性有了限制。同时包也有了限制），这点和Java不一样，体现出Scala包使用的灵活性。
  * 当然，也可以将可见度延展到上层包private[atguigu] val description="zhangsan"
  * 说明：private也可以变化，比如protected[atguigu], 非常的灵活.
  * 这个不做演示
  *
  * @author welldo
  *  2019/12/01
  */
object TestVisit1 {

}
