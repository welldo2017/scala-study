package com.welldo.scalaStudy.chapter5.function1

/*
  * 1)在scala中，方法和函数几乎可以等同(比如他们的定义、使用、运行机制都一样的)，
  * 只是函数的使用方式更加的灵活多样  [方法转函数]。
  *
  * 函数:function -> 函数式编程
  * 方法: method -> oop编程
  *
  *
  **********************************************************
  * def 函数名 ([参数名: 参数类型], ...) [ [: 返回值类型] = ] {
  *   xxxxxxxxxxxxxxxxxx
  *   xxxxxxxxxxxxxxxxxx
  *   return 返回值
  * }
  *
  * 1) 函数声明关键字为def  (definition)
  * 2) [参数名 : 参数类型], ... 表示函数的输入(就是参数列表), 可以没有。 如果有，多个参数使用逗号间隔
  * 3) 函数中的语句：表示为了实现某一功能代码块
  *
  * 5) 返回值形式1:
  *         : 返回值类型 =  表示有返回值，并且指定了返回值的类型
  * 6) 返回值形式2:
  *         = , 表示返回值类型，使用类型推导
  * 7) 返回值形式3:
  *         空的 ，表示没有返回值，即使有return 也不生效
  *
  * 8) 如果没有return ,默认以执行到最后一行的结果作为返回值
  *
  * author: welldo 
  * date: 2019/11/17 19:26
  */
object Function1 {

  def main(args: Array[String]): Unit = {
    println(sum(10, 20))

    println(sumWithReturn(10, 20))

    println(arithmeticOpt(10, 20, '-'))
    println(arithmeticOpt(10, 20, '/'))

    println(sumWithNoReturn(10, 20))

  }

  /**
    * 返回值形式1: 表示有返回值，并且指定了返回值的类型
    * 执行到最后一行作为返回值
    */
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  /**
    * 返回值形式1: 表示有返回值，并且指定了返回值的类型
    *  手动return
    */
  def sumWithReturn(n1: Int, n2: Int): Int = {
    val sum = n1 + n2
    return sum
  }

  /**
    * 使用类型推导
    * 最后一个参数 可以为 + 或者 -
    */
  def arithmeticOpt(n1:Int,n2:Int,opt:Char)={
    if (opt == '+') {
      n1 + n2
    }else if (opt == '-'){
      n1 - n2
    }else{
      null
    }
  }

  /**
    * 没有返回值
    * 则返回 unit的唯一实例: 一对小括号 ()
    */
  def sumWithNoReturn(n1:Int,n2:Int){
    n1+n2
  }

}
