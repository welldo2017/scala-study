package com.welldo.scalaStudy.chapter5.functionDetail2

/**
  * 6)如果函数明确声明无返回值（声明 :Unit），
  * 那么函数体中即使使用return关键字也不会有返回值
  *
  * 另外: 将函数的返回类型为Unit的函数称之为过程(procedure)
  *
  * @author welldo
  *         2019/11/21
  */
object Detail6 {

  def main(args: Array[String]): Unit = {
    println(test())
    println(test1())
  }

  def test(): Unit ={
    30
  }

  def test1(): Unit ={
    return 30
  }





}