package com.welldo.scalaStudy.chapter2.dataType2

/**
  * Unit类型、Null类型和Nothing类型
  *
  * 1)Null类只有一个实例:null。
  *     null可以赋值给任意引用类型(AnyRef)
  *     但是不能赋值给值类型(AnyVal)
  *
  * 2)Unit类型用来标识 "过程"，(过程, 就是没有明确返回值的函数。)
  *     由此可见，Unit类似于Java里的void。
  *     Unit只有一个实例: ()，这个实例也没有实质的意义
  *
  * 3)Nothing，可以作为没有正常返回值的方法的返回类型，
  *   非常直观的告诉你这个方法不会正常返回，
  *   而且由于Nothing是其他任意类型的子类，他还能跟要求返回值的方法兼容
  *
  * author: welldo 
  * date: 2019/11/26 14:29
  */
object TypeDemo5 {
  def main(args: Array[String]): Unit = {

  }



}
