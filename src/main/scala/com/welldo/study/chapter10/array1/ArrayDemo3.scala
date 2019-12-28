package com.welldo.study.chapter10.array1

import scala.collection.mutable.ArrayBuffer

/**
  * 数组-变长数组
  *
  * 1)ArrayBuffer是变长数组，类似java的ArrayList
  * 2)val arr2 = ArrayBuffer[Int]() 也是使用的apply方法构建对象
  * 3)def append(elems: A*) 接收的是可变参数.
  * 4)每append一次，arr在底层会重新分配空间，进行扩容，arr2的内存地址会发生变化，也就成为新的ArrayBuffer
  *
  * ArrayBuffer 可以直接输出, (输出的不是引用地址), 也可以用for循环
  * @author welldo
  * date 2019/12/12
  */
object ArrayDemo3 {
  def main(args: Array[String]): Unit = {
    //创建
    val arr = ArrayBuffer[Any](3, 2, 5)
    //可以直接输出
    println(arr)
    println(arr.hashCode())
    println("==================")

    //增
    arr.append(4,6,8)
    println(arr)
    println(arr.hashCode())
    println("==================")

    //改
    arr(0) = "白居易"
    println(arr)
    println("==================")

    //删除
    arr.remove(0)
    println(arr)
  }
}
