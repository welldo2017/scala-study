package com.welldo.scalaStudy.chapter3.assign

/**
  * @author welldo 
  *  2019/11/17
  *
  *  赋值运算符
  * 1. +=  相加后再赋值 c += 10,等于 c= c+10
  * 2. -=  相减后再赋值
  * 3. *=  相乘后再赋值
  * 4. /=  相除后再赋值
  * 5. %=  取余后再赋值
  *
  *
  * 6. <<=  左移后赋值 c <<= 2 等于 c = c<<2 (左移2位,意思是c*2*2)
  * 7. >>2  右移后赋值
  *
  * 8. &=  按位与后 赋值 (不懂)
  * 9. |=  按位或后 赋值(不懂)
  */
object Demo1 {

  def main(args: Array[String]): Unit = {
    var a = 2
    a <<= 2 //左移n位, 等于 a乘以n个2, 这里是 a乘以2个2
    println(a)


    //还能使用代码块{}赋值
    val b = {
      //这里面随便写逻辑, 比如这里返回一个int
      2
    }
    println(b)
  }


}
