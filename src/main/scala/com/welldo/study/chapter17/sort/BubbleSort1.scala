package com.welldo.study.chapter17.sort

/**
  * 冒泡排序原理(来自百度百科):
  *
  * 第一轮
  * 比较相邻的元素。如果第1个比第2个大，就交换他们两个。（找到了前两个数中最大的值）
  * 再对第2个（也就是目前最大的值）和第3个做同样的比较.(找到了前3个数中最大的值),以此类推,
  * 也就是说，每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。
  * 这一轮走完，就找到了最大的数。
  *
  * 再走第2轮,
  * 和上面一样的方法，比较相邻的元素，除了最后一个（因为最后一个数就是最大的数），找到了倒数第二大的数。
  *
  * 第三轮，第四轮。。。
  *
  *
  *
  *
  * 原始数组：
  * 10,8,5,7,12,6,15,13,3
  *
  * 下面是第一轮的过程
  * 10,8,5,7,12,6,15,13,3
  * 8,10,5,7,12,6,15,13,3
  * 8,5,10,7,12,6,15,13,3
  * 8,5,7,10,12,6,15,13,3
  * 8,5,7,10,12,6,15,13,3
  * 8,5,7,10,6,12,15,13,3
  * 8,5,7,10,6,12,15,13,3
  * 8,5,7,10,6,12,13,15,3
  * 8,5,7,10,6,12,13,3,15
  *
  * author welldo
  * date 2020/4/18 23:20
  */
object BubbleSort1 {

  /**
    * 测试数据,
    * 1w个数字,耗时0.2s左右
    * 10w个数字,耗时23s左右
    */
  def main(args: Array[String]): Unit = {
    //演示用的简单数组
    val arr = Array(10, 8, 5, 7, 12, 6, 15, 13, 3)

    //固定长度的随机数组
//    val arr = getArray(10000)


    val begin = System.currentTimeMillis()
    bubble(arr)
    println(arr.mkString(","))
    val end = System.currentTimeMillis()

    println("耗时：" + (end - begin) + "ms")
  }


  /**
    * 冒泡排序
    */
  def bubble(arr: Array[Int]) = {
    val length: Int = arr.length

    for (i <- 0 until length - 1) {
      for (j <- 0 until length - 1 - i) {
        if (arr(j) > arr(j + 1)) {
          val temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
      println(arr.mkString(","))
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
