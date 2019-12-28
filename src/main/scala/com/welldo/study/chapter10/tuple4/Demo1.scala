package com.welldo.study.chapter10.tuple4

/**
  * 元祖 基本介绍
  * 可以理解为一个容器，可以存放各种相同或不同类型的数据。
  * 说的简单点，就是将多个无关的数据封装为一个整体，称为元组,
  * 最大的特点是灵活,对数据没有过多的约束。
  *
  * 说明
  * 2. 根据元素个数不同(从1个到22个)，对应的类型是 Tuple1----Tuple22
  * 3. Tuple是一个整体，使用迭代器进行遍历
  * 4. 访问Tuple的元素的方式是 tuple._1 , tuple._2,tuple._3 ......
  * 5. 元组是scala推荐使用，在java没有
  *
  * @author welldo
  *         date 2019/12/12
  */
object Demo1 {
    def main(args: Array[String]): Unit = {
        //1. 创建
        val myTuple = (1, 2, "hello")

        //2. 访问: 使用下划线
        println(myTuple._1 + ", " + myTuple._2 + ", " + myTuple._3)
        println("==================")

        //2. 访问: 使用productElement(index), 索引从0开始
        println(myTuple.productElement(2))
        println("==================")

        //2. 访问: 迭代器
        val iterator = myTuple.productIterator
        iterator.foreach(println)
    }

}
