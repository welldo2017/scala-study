package com.welldo.scalaStudy.chapter10.map6

import scala.collection.mutable

/**
  * Map的遍历
  * map的遍历支持多种形式:
  *
  * author: welldo 
  * date: 2019/12/14 17:56
  */
object MapDemo3 {
    def main(args: Array[String]): Unit = {
        val map = mutable.Map[String, Any]("a" -> 10, "b" -> 20, "c" -> 30)

        println("=========for1=========")
        for ((key, value) <- map) println(key + " = " + value)

        println("=========for2, 取出keySet=========")
        for (key <- map.keys) println(key)

        println("=========for3, 取出 valueSet=========")
        for (v <- map.values) println(v)

        println("=========for4, 取出二元组=========")
        for (elem <- map) println(elem._1 + "=" + elem._2)

    }

}
