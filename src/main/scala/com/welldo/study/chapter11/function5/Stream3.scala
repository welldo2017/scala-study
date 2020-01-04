package com.welldo.study.chapter11.function5

/**
  * Stream 流
  * stream是一个集合。这个集合，可以用于存放无穷多个元素，但是这无穷个元素并不会一次性生产出来，
  * 产生的规则, 由你自己指定
  * 而是需要用到多大的区间，就会动态的生产，末尾元素遵循lazy规则(即：要使用时才进行计算) 。
  *
  * 说明
  *     1)Stream 集合存放的数据类型, 自己指定
  *     2)numsForm 是自定义的一个函数，函数名随意。
  *     3)创建的集合的第一个元素是 n , 后续元素生成的规则是自定义
  *
  * author: welldo 
  * date: 2020/1/1 15:53
  */
object Stream3 {
    def main(args: Array[String]): Unit = {
        val stream = numsForm(1)
        println(stream)     //Stream(1, ?)

        //取出第一个
        println("head=" + stream.head)

        //取出下一个元素, 这个操作会触发一次运算
        println(stream.tail) // (2, ?)
        println(stream.tail.tail) // (4, ?)
        println(stream.tail) // (2, ?)

        println(stream)     //Stream(1, 2, 4, ?)
    }

    //创建Stream
    def numsForm(n: Int) : Stream[Int] = {
        n #:: numsForm(n * 2)
    }

}
