package com.welldo.scalaStudy.chapter10.dimArray2

/**
  * 多维数组
  * Array.ofDim[Int](n1,n2), n1代表多个一维数组, n2代表每一个一维数组中有几个元素
  * 简单来说, 就是n1 行, n2 列
  *
  * @author welldo
  * date 2019/12/12
  */
object DimArray1 {
  def main(args: Array[String]): Unit = {

    //创建
    val array = Array.ofDim[Int](3,4)

    //遍历
    for (elem <- array) {
      //每个elem都是一个一维数组
      for (e <- elem) {
        print("\t" + e )
      }
      println()
    }
    println("==================")

    //取出指定的元素
    println(array(1)(1))

    //update
    array(1)(1)= 100
    println(array(1)(1))
  }
}
