package com.welldo.scalaStudy.chapter2.dataType2

/**
  * 在Scala中数据类型都是对象，
  * 也就是说scala没有java中的原生类型(int, long, flout , double 等)
  *
  * author: welldo 
  * date: 2019/11/26 10:27
  */
object TypeDemo1 {

  def main(args: Array[String]): Unit = {
    //在scala中，一切皆为对象 ，比如(Int,Float,Char....)
    var num1:Int = 10
    println(num1.toString) //因为只有对象才能调方法
    
    var sex = '男'
    println(sex.toString) //因为只有对象才能调方法
  }

}
