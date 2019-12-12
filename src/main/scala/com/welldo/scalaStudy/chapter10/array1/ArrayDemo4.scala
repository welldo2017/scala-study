package com.welldo.scalaStudy.chapter10.array1

import scala.collection.mutable.ArrayBuffer

/**
  * 变长 / 定长 数组的转换
  * 1)arr1.toBuffer  //定长数组 转 可变数组 (返回新的对象, 原对象不变)
  * 2)arr2.toArray  //可变数组 转 定长数组 (返回新的对象, 原对象不变)
  *
  * @author welldo
  * date 2019/12/12
  */
object ArrayDemo4{
  def main(args: Array[String]): Unit = {
    //创建
    val arr = ArrayBuffer[Any](3, 2, 5)
    println(arr)
    println("==================")

    //转换
    val array = arr.toArray
    //如果希望将一个数组Array的内容输出，可以简单的使用mkString
    println(array.mkString(","))
    println("==================")

    //转换
    val buffer = array.toBuffer
    println(buffer)
  }
}
