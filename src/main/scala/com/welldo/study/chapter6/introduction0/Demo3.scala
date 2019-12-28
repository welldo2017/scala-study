package com.welldo.study.chapter6.introduction0

/**
  * 如果在定义属性时，暂时不赋值时,使用符号_(下划线)，
  * 让系统分配默认值, 这时要求属性必须给定数据类型。
  * byte short int long |   0
  * float double        |   0.0
  * String 和其他引用    |   null(不是 "" )
  * boolean             | false
  *
  *
  * author: welldo 
  * date: 2019/11/23 16:58
  */
object Demo3 {
  def main(args: Array[String]): Unit = {
    val value = new DefaultValue
    println(value.name)
    println(value.age)
    println(value.salary)
    println(value.isDead)
  }

}

class DefaultValue {
  var name: String = _
  var age: Int = _
  var salary: Double = _
  var isDead: Boolean = _
}
