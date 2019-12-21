package com.welldo.scalaStudy.chapter11.introduction1

/**
  * 何为高阶函数?
  * 参数列表中,能接收函数 的函数,叫做高阶函数.
  *
  * 将函数作为参数传递给另外一个函数,这是函数式编程的特点
  *
  * 后面会详讲, 这里先简单介绍
  *
  * author: welldo 
  * date: 2019/12/15 14:29
  */
object HighOrderFunction2 {
    def main(args: Array[String]): Unit = {
        //1. 注意: 这里不能写成 test(sum(),3.5) ,
        // 写成sum(),表示执行sum这个方法, 则返回一个double
        // test方法需要的是一个 函数, 不是一个double
        val d = test1(sum,3.5)
        println(d)

        //2. 那么问题来了
        // 从 chapter5.functionDetail2 中我们知道, 调用无参的方法时, 可以不带括号()

        // 我现在想把 without() 这个函数, 赋值给一个参数
        val i = without
        //那么这里 不写括号, 到底是调用呢? 还是像例1一样, 把这个函数赋值给参数呢?
        //所以这里有歧义
        // 解决办法: 针对无参函数, 写成"函数名 _"
        val w = without _

        val result = test2(w)
        println(result)

        //3. 为了减轻记忆负担, 1和2 统一, 只记忆例2, 写成"函数名 _"
        val d2 = test1(sum _, 3.5)
        println(d2)
    }

    // test函数, 是高阶函数
    // 第一个参数: 类型为 f: Double => Double 的函数,这个函数接收一个double, 返回一个double
    // 第二个参数: n1是普通参数
    def test1(f: Double => Double, n1: Double) = {
        f(n1)
    }

    //高阶函数2
    // 参数为: 无参且返回值为int的函数
    def test2 (f: () => Int)={
        f()
    }

    //普通函数: 接收一个double, 返回一个double
    def sum(d: Double): Double = {
        println("sum()方法被调用")
        d + d
    }

    //普通函数: 无参
    def without():Int={
        println("无参方法被调用")
        10
    }

}
