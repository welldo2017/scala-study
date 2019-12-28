package com.welldo.study.chapter5.functionDetail2

/**
  * 7)不确定返回值类型，那么返回值类型可以省略(也就是自动推导),或声明为Any
  *
  * 8) 如果明确函数无返回值, 那么返回值类型可以省略(也就是自动推导成unit),或声明为Any
  * @author welldo
  *         2019/11/21
  */
object Detail7 {

  def main(args: Array[String]): Unit = {
    sout()
  }

  //7
  def test(n:Int) ={
    if (n==1) {
      1
    }else{
      "不等于1"
    }
  }

  //8 如果明确函数无返回值, 那么返回值类型可以省略(也就是自动推导成Unit),
  // 或声明为Any, 因为unit -> anyVal -> Any
  def sout ()={
    println("没有返回值")
  }






}