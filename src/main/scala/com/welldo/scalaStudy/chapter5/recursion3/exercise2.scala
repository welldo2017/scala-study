package com.welldo.scalaStudy.chapter5.recursion3

/**
  *
  * 练习2:
  * 已知 f(1) =3,
  * f(n)= 2*f(n-1)+1
  * 求 f(n)
  *
  * @author welldo
  *  2019/11/20
  */
object exercise2 {
  def main(args: Array[String]): Unit = {
    println(f(3))
  }


  /**
    * 简单, 直接套用公式即可
    */
  def f(n:Int) :Int ={
    if (n ==1) {
      3
    }else if (n >=2 ){
      2 * f(n-1) +1
    }else{
      0
    }
  }

}
