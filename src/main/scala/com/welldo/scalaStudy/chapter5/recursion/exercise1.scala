package com.welldo.scalaStudy.chapter5.recursion

/**
  * 练习1:
  * 斐波那契数 : 1,1,2,3,5,8,13,21...
  *  对应的位置  1,2,3,4,5,6,7, 8...
  *
  * 给你一个大于0的整数n(位置数), 求出此位置上对应的斐波那契数
  */
object exercise1 {
  def main(args: Array[String]): Unit = {

    println(getFBN(9))
  }

  /**
    * 传入位置, 求出对应的斐波那契数
    */
  def getFBN(index:Int): Int ={
    //位置1和2, 对应的数为1
    if (index == 1 || index ==2) {
      1
    }else{
      getFBN(index-1) + getFBN(index -2)
    }

  }



}
