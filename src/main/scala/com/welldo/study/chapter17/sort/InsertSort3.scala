package com.welldo.study.chapter17.sort

/**
  * 插入排序原理(来自百度百科):
  * 插入排序，一般也被称为直接插入排序。对于少量元素的排序，它是一个有效的算法 [1]  。插入排序是一种最简单的排序方法，它的基本思想是将一个记录插入到已经排好序的有序表中，从而一个新的、记录数增1的有序表。在其实现过程使用双层循环，外层循环对除了第一个元素之外的所有元素，内层循环对当前元素前面有序表进行待插入位置查找，并进行移动
  * (这是什么jb玩意儿? 说了等于放屁)
  *
  *
  * 我个人的理解:
  * n个元素的数组, 比如 10,8,5,7,12,6,15,13,3
  * step1,将数组的第1个元素,和其他元素逻辑拆开,分成两个数组, 第一个是有序数组,第二个是无序数组.
  * 分成(10)(8,5,7,12,6,15,13,3)
  *
  * step2,将无序列表的第1个,拎出来,和有序列表的最后1个(也是唯一一个)进行比较, 比较后,并放到有序数组中去. 结果还是两个数组
  * 分成(8,10)(5,7,12,6,15,13,3)
  *
  * step3,将无序列表的第1个,拎出来,和有序列表的元素依次比较(顺序是从右到左), 比较后,并放到有序数组中去. 结果还是两个数组
  * 分成(5,8,10)(7,12,6,15,13,3)
  *
  * 以此类推
  *
  * 原始数组：
  * 10,8,5,7,12,6,15,13,3
  *
  * 8,10,5,7,12,6,15,13,3
  * 5,8,10,7,12,6,15,13,3
  * 5,7,8,10,12,6,15,13,3
  * 5,7,8,10,12,6,15,13,3
  * 5,6,7,8,10,12,15,13,3
  * 5,6,7,8,10,12,15,13,3
  * 5,6,7,8,10,12,13,15,3
  * 3,5,6,7,8,10,12,13,15
  *
  *
  * author welldo
  * date 2020/4/18 23:20
  */
object InsertSort3 {

  /**
    * 测试数据,
    * 1w个数字,耗时0.02s左右
    * 10w个数字,耗时1.4s左右
    */
  def main(args: Array[String]): Unit = {
    //演示用的简单数组
    val arr = Array(10, 8, 5, 7, 12, 6, 15, 13, 3)

    //固定长度的随机数组
//        val arr = getArray(100000)


    val begin = System.currentTimeMillis()
    insert(arr)
    //    println(arr.mkString(","))
    val end = System.currentTimeMillis()

    println("耗时：" + (end - begin) + "ms")
  }


  /**
    * 插入排序
    *
    */
  def insert(arr: Array[Int]) = {
    val length: Int = arr.length

    for (i <- 1 until length) {
      //无序列表的第一个元素
      var unsortArrayFirstValue = arr(i)

      //有序列表的最后一个元素的索引
      var sortArrayLastIndex = i-1

      while (sortArrayLastIndex >= 0 && unsortArrayFirstValue < arr(sortArrayLastIndex)) {
        //10 8 5 7 ==> 10 10 5 7
        arr(sortArrayLastIndex +1) = arr(sortArrayLastIndex)//arr(1) = 10

        //跳出循环
        sortArrayLastIndex -=1
      }

      //10 8 5 7 ==> 10 10 5 7 ==> 8 10 5 7
      arr(sortArrayLastIndex+1) = unsortArrayFirstValue
      println(arr.mkString(","))
    }







  }


  /**
    * 创建一个 指定长度的内容随机的数组
    */
  def getArray(length: Int) = {
    val arr = new Array[Int](length)

    val random = new util.Random()
    for (i <- 0 until length) {
      arr(i) = random.nextInt()
    }
    arr
  }

}
