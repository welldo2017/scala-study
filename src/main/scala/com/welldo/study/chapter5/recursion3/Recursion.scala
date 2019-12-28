package com.welldo.study.chapter5.recursion3

/**
  * 函数递归需要遵守的重要原则（总结）:
  * 1)程序执行一个函数时，就创建一个新的受保护的独立空间(新函数栈)
  * 2)函数的局部变量是独立的，不会相互影响
  * 3)递归必须向退出递归的条件逼近，否则就是无限递归，死龟了:)
  * 4)当一个函数执行完毕，或者遇到return，就会返回，遵守谁调用，就将结果返回给谁。
  *
  * @author welldo
  *         2019/11/19
  */
object Recursion {
  def main(args: Array[String]): Unit = {

    //依次输出2,3,4
    test(4)
  }


  /**
    * 递归运行原理(详细见图)
    */
  def test(n: Int): Unit = {
    if (n > 2) {
      test(n - 1)
    }
    println("n= " + n)

  }

}
