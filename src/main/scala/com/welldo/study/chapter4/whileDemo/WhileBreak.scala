package com.welldo.study.chapter4.whileDemo

/**
  * author: welldo 
  * date: 2019/11/17 18:16
  *
  * Scala内置控制结构 特地 去掉了break和continue，
  * 是为了更好的适应函数化编程，
  * 推荐使用函数式的风格解决break和contine的功能，而不是一个关键字
  */
import  util.control.Breaks._
object WhileBreak {

  def main(args: Array[String]): Unit = {

    //打印1-20, 但是10以后不要打印..
    var num = 0
    while (num < 20 ){
      num += 1
      printf("index = %d\n",num)

      if(num >10 ){
        //如果按照java的习惯, 写上break即可.但是scala中没有break
        //但是有break()方法, (需要导包 import  util.control.Breaks._)
        break();
      }
    }

    println("正常结束")

  }



}
