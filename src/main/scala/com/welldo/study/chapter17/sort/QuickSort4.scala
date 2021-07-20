package com.welldo.study.chapter17.sort
import  util.control.Breaks._

/**
  * 前面3种,没有使用递归. 下面的方法,将使用递归
  *
  *
  * 快速排序（Quicksort）是对冒泡排序的一种改进
  * 排序原理(来自百度百科):
  * 快速排序由C. A. R. Hoare在1960年提出。它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
  * (这又是什么jb? 说了等于没说)
  *
  *
  *
  * 原始数组：
  * 10,8,5,7,12,6,15,13,3
  *
  *
  *
  * author welldo
  * date 2020/4/18 23:20
  */
object QuickSort4 {

  /**
    * 测试数据,
    * 1w个数字,耗时0.02s左右
    * 10w个数字,耗时1.4s左右
    */
  def main(args: Array[String]): Unit = {
    //演示用的简单数组
//    val arr = Array(9,10,9,1,-1)

    //固定长度的随机数组
   val arr = getArray(100000)


    val begin = System.currentTimeMillis()
    quick(0, arr.length-1,arr)
    //    println(arr.mkString(","))
    val end = System.currentTimeMillis()

    println("耗时：" + (end - begin) + "ms")
  }


  /**
    * 数组最左边的下标,也就是0
    * 数组最右边的下标,也就是length-1
    *
    * pivot	[ˈpɪvət]
    * n.	支点; 枢轴; 中心点; 最重要的人(或事物); 中心; 核心;
    */
  def quick(left: Int, right: Int, arr: Array[Int]): Unit = {
    //10,8,5,7,12,6,15,13,3
    var l = left //0
    var r = right//8

    val pivotValue = arr((left + right) / 2) // 以中间的值为基准进行分割

    var temp = 0
    breakable {
      // while 语句的作用就是把比 pivotValue 小的数放到左边, 比pivot大的数放到右边
      while (l < r) {
        while (arr(l) < pivotValue) { //从左边找一个比 pivotValue 大的值对应下标
          l += 1
        }
        while (arr(r) > pivotValue) { //从右边找一个比 pivotValue 小的值对应下标
          r -= 1
        }

        if (l >= r) { // 说明本次交换结束,退出本次while
          break()
        }
        var temp = arr(l)  //交换
        arr(l) = arr(r)
        arr(r) = temp

        //todo 没看懂
        if (arr(l) == pivotValue) {
          r -= 1
        }
        //
        if ((arr(r)) == pivotValue) {
          l += 1
        }
      }
    }
    if (l == r) { // 提高效率
      l += 1
      r -= 1
    }

    if (left < r) { //向左递归排序
      quick(left, r, arr)
    }
    if (right > l) {//向右递归排序
      quick(l, right, arr)
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
