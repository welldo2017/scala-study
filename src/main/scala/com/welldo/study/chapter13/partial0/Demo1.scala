package com.welldo.study.chapter13.partial0

import scala.collection.immutable

/**
  * 偏函数
  *
  * 需求:
  * 集合val list = List(1, 2, 3, 4, "abc")
  * 将集合list中的所有数字+1，并返回一个新的集合
  * 要求忽略掉 非数字 的元素，即返回的 新的集合 形式为 (2, 3, 4, 5)
  *
  * 1. 先使用传统方式
  *
  * author : welldo 
  * date : 2020/1/14 16:55
  */
object Demo1 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, "abc")

        //先过滤(注意, 类型是 List[any] )
        val list1 = list.filter(findInt)
        println(list1)

        // 注意: list1 还是 List[any] , 需要先转成int
        val list2 = list1.map(add1)
        println(list2)

        //传统方法, 比较麻烦
    }

    //筛选出int
    def findInt(item: Any) = {
        val bool = item.isInstanceOf[Int]
        bool
    }

    // 把any转成int, 再 +1
    def add1(num: Any) = {
        num.asInstanceOf[Int] + 1
    }

}
