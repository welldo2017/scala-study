package com.welldo.scalaStudy.chapter10.arrayToJavaList3

import scala.collection.mutable.ArrayBuffer

/**
  * scala集合与java集合之间的相互转换
  *
  * @author welldo
  * date 2019/12/12
  */
object Demo1 {
  def main(args: Array[String]): Unit = {
    // Scala集合和Java集合互相转换
    val arr = ArrayBuffer("1", "2", "3")


    //即这里的bufferAsJavaList是一个隐式函数
    import scala.collection.JavaConversions.bufferAsJavaList

    //ProcessBuilder 接受一个List<String> command,
    val javaArr = new ProcessBuilder(arr)
    val list = javaArr.command()
    println(list)
  }
}
