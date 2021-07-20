package com.welldo.study.chapter17.sort

/**
  * 选择排序原理(来自百度百科):
  *
  * 选择排序（Selection sort）是一种简单直观的排序算法。
  * 它的工作原理是：第一次, 从整个数组中,选出最小的元素，和第一位交换.
  * 最小的就确定了
  *
  * 第二轮,
  * 再从剩余的未排序元素中寻找到最小元素，和第二位交换, 第2小的就确定了
  *
  * 以此类推，直到全部待排序的数据元素的个数为零。
  * 选择排序是不稳定的排序方法。
  *
  *
  * 原始数组：
  * 10,8,5,7,12,6,15,13,3
  * 3,8,5,7,12,6,15,13,10//第1轮:
  * 3,5,8,7,12,6,15,13,10//第2轮:
  * 3,5,6,7,12,8,15,13,10//第3轮:
  * 3,5,6,7,12,8,15,13,10//第4轮:
  * 3,5,6,7,8,12,15,13,10//第5轮:
  * 3,5,6,7,8,10,15,13,12//第6轮:
  * 3,5,6,7,8,10,12,13,15//第7轮:
  * 3,5,6,7,8,10,12,13,15//第8轮:
  *
  *
  * author welldo
  * date 2020/4/19 01:00
  */
object SelectSort2 {

  /**
    * 测试数据,
    * 1w个数字,耗时0.05s左右
    * 10w个数字,耗时4.4s左右
    */
  def main(args: Array[String]): Unit = {
    //演示用的简单数组
//    val arr = Array(10, 8, 5, 7, 12, 6, 15, 13, 3)

    //固定长度的随机数组
    val arr = getArray(100000)

    val begin = System.currentTimeMillis()
    selection(arr)
    val end = System.currentTimeMillis()
    println("耗时：" + (end - begin) + "ms")

//    println(arr.mkString(","))
  }



  def selection(arr: Array[Int]) = {
    val length: Int = arr.length

    for (i <- 0 until length) {

      //假定第0个元素,就是最小的
      var minIndex = i
      var minValue = arr(i)

      for (j <- (i+1) until length) {
        if (minValue > arr(j)) {
          //把较小值,和对应的位置,存放在内存中.
          minValue = arr(j)
          minIndex = j
        }
      }

      //判断,是否需要执行覆盖.(覆盖比交换操作要快)
      if (minIndex != i) {
        arr(minIndex)= arr(i)
        arr(i) = minValue
      }
    }
  }


  /**
    * 创建一个 指定长度的内容随机的数组
    */
  def getArray(length:Int) = {
    val arr = new Array[Int](length)

    val random = new util.Random()
    for (i <- 0 until length) {
      arr(i) = random.nextInt()
    }
    arr
  }

}
