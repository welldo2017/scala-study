package com.welldo.study.chapter13.anonymous2

/**
  * 匿名函数
  *   1. 匿名函数的返回值类型, 是通过 类型推导来决定的
  *   2. 普通函数的 = 变成了 =>
  *   3. 如果函数体为单行, 可以不写 {} , 多行需要写{}
  *
  * 非常easy, 非常常用
  *
  * @author welldo
  * date 2020/1/14
  */
object AnonymousFun {
  def main(args: Array[String]): Unit = {
    //将下面的普通函数, 转换成 匿名函数, 并赋值给 某个引用
    val tripleNoName = (n:Int) => { 3*n }
    println(tripleNoName(3))
  }


  //普通函数
  def triple(n:Int):Int={
    3*n
  }
}
