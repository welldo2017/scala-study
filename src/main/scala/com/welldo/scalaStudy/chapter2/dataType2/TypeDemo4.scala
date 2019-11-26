package com.welldo.scalaStudy.chapter2.dataType2

/**
  * 1)字符常量是用单引号 ‘ ’ 括起来的单个字符。
  * 例如：
  * var c1 = 'a‘
  * var c2 = '中‘
  * var c3 =  '9'
  *
  * 2) Scala 也允许使用转义字符‘\’来将其后的字符转变为特殊字符型常量。例如：var c3 = ‘\n’
  *    '\n'表示换行符
  *
  * 3)可以给Char赋一个整数(只判断是否范围越界)，输出时，会按照对应的unicode 字符输出
  *     ['\u0061' --> 97 --> a]
  *
  * 4) Char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码.
  *
  * author: welldo 
  * date: 2019/11/26 13:26
  */
object TypeDemo4 {
  def main(args: Array[String]): Unit = {
    //1
    var c1 = 'a'
    var c2 = '中'
    var c3 =  '9'

    //2, 表示换行
    val cn = '\n'
    val ct = '\t'
    println("****"+ct + "****")
    print(cn)
    println("****"+ct + "****")

    //3.
    val num:Char = 97 //a
    println(num)

    val charMax = Char.MaxValue
    println(charMax.toInt)


  }

  /**
    * Char类型是可以进行运算的，相当于一个整数
    * 但是在运算的时候, 会将char转成int进行运算
    */
  def Practice()={
    var char1 :Char = 'a'
    var num = 10 + char1//先将char转成int, 再进行运算, 所以最终的num是int
    println(num)


    //判断下列语句, 在编译时是否报错
    //var char2 :Char = 'a'+1     // 错误, 运算的时候, 会将char转成int进行运算, 所以char2应该为int
    //var char3 :Char = 97 + 1      //错误, 两个int进行运算, 最终也为int, 所以char3应该为int
    var char4 :Char = 97          //正确, 可以给Char赋一个整数(只判断是否范围越界),此时不越界
    //var char5 :Char = 99999       //错误, 可以给Char赋一个整数(只判断是否范围越界),此时越界






  }



}
