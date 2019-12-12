package com.welldo.scalaStudy.chapter10.array1

/**
  * 数组-定长数组
  * 定义数组的第2种方式-直接初始化
  *
  * @author welldo
  * date 2019/12/12
  */
object ArrayDemo2 {
  def main(args: Array[String]): Unit = {
    // 创建一个数组, 使用的是object array 的apply方法
    //这里用的是类型推导
    val ints = Array(1,20,90)

    val strings = Array("ss","aa")

    val anys = Array(1,"ss")

  }
}
