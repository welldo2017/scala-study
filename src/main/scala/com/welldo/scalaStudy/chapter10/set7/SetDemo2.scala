package com.welldo.scalaStudy.chapter10.set7

import scala.collection.mutable

/**
  * Set 集
  * 可变的set 才支持增删
  *     添加: 重复添加时不会报错
  *         1. add()
  *         2. +=
  *         3. +=()
  *     删除: 如果删除的对象不存在, 不会报错
  *         1. -=
  *         2. -=()
  *         3. remove()
  *
  * author: welldo 
  * date: 2019/12/15 12:42
  */
object SetDemo2 {
    def main(args: Array[String]): Unit = {
        //不可变的Set 不能增删改
        val set1 = Set()
        //set1 += 1

        //可变set
        println("=========set Add=========")
        val ms = mutable.Set[Any]()
        ms.add(1)
        ms += ("a")
        ms += 2.0
        println(ms)

        println("=========set for=========")
        for (elem <- ms) {println(elem)}

        println("=========set delete=========")
        ms.remove(10) //删除不存在的,不会报错
        ms.remove(1)
        ms -= 2.0
        ms -= ("a")
        println(ms)
    }

}
