package com.welldo.study.chapter13.curry6

/**
  * 函数柯里化(curry)
  *
  * 1)函数编程中，接受多个参数的函数, 都可以转化为接受单个参数的函数，这个转化过程就叫柯里化
  * 2)柯里化, 证明了函数只需要一个参数。
  *
  * 自己写柯里化的场景应该不多, 但是需要看懂.
  *
  * author : welldo 
  * date : 2020/1/17 17:23
  */
object Demo1 {
    def main(args: Array[String]): Unit = {
        //编写一个函数，接收两个整数，可以返回两个数的乘积，要求:
        //使用常规的方式完成
        println(mul(10, 10))

        //使用闭包的方式完成
        println(mulCurry(10)(9))

        //使用函数柯里化完成
        println(mulCurry2(10)(8))
    }

    def mul(x: Int, y: Int): Int = x * y

    def mulCurry(x: Int): Int => Int = (y: Int) => x * y

    def mulCurry2(x: Int)(y: Int): Int = x * y

}
