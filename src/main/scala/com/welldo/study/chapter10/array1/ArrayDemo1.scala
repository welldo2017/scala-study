package com.welldo.study.chapter10.array1

/**
  * 数组-定长数组
  * 定义数组的第一种方式
  *
  * Array直接输出为 内存地址, 应该for循环输出, 或者mkString
  *
  * @author welldo
  * date 2019/12/12
  */
object ArrayDemo1 {
  def main(args: Array[String]): Unit = {
    // 创建一个数组, 存放int, 默认长度为5
    val array = new Array[Int](5)

    //求长度
    println("length: "+array.length)

    //使用 小括号,访问指定的元素,(索引从0开始)
    println("第一个元素: "+array(0))
    //修改
    array(0) = 10

    //遍历
    println("==================")
    println(array)
    println(array.mkString(","))
    for (elem <- array) {
      println(elem)
    }

  }

}
