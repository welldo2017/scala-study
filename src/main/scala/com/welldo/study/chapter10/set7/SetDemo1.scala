package com.welldo.study.chapter10.set7

import scala.collection.mutable

/**
  * Set 集
  * 集是不重复元素的结合。集不保留顺序，默认是以哈希集实现
  * 同样, 也分为 可变和不可变, 默认为不可变
  *
  * author: welldo 
  * date: 2019/12/15 12:42
  */
object SetDemo1 {
    def main(args: Array[String]): Unit = {
        val set1 = Set(1,2,3)
        println(set1)

        val set2 = mutable.Set("a","b","b")
        println(set2)

    }

}
