package com.welldo.study.chapter9.demo1

/**
  * 二. 隐式值
  *
  *     当某个变量 被标记为implicit 时, 这个变量为 隐式值，
  *     当某个形参变量标记为implicit，即隐式参数
  *     在方法被调用时, 并省略隐式参数的情况下, 去搜索作用域内的 隐式值 当做默认值
  *
  *     (隐式值和默认值的区别: 前者可以给多个函数赋默认值, 后者只能给一个函数赋默认值)
  *
  * author: welldo 
  * date: 2019/12/28 14:57
  */
object ImplicitValue4 {
    def main(args: Array[String]): Unit = {
        //这里的 str1就是隐式值
        implicit val str1: String = "jack"

        //1.implicit name: String 是一个隐式参数
        //2.当调用hello 方法时，没有传入实参, 则编译器会自动的将 隐式值 关联到 隐式参数 上
        def hello(implicit name: String): Unit = {
            println(name + " hello")
        }

        hello //用到隐式值 底层  hello$1(str1)
        //hello() 调用时 不需要加(), 加了就表示 你要手动传值.

    }

}
