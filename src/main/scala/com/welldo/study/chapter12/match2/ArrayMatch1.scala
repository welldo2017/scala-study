package com.welldo.study.chapter12.match2

import scala.collection.mutable.ArrayBuffer

/**
  * 匹配数组
  * 规则如下:
  * 1)Array(0) 匹配只有一个元素且为0的数组。
  * 2)Array(x,y) 匹配数组有两个元素，并将两个元素赋值为x和y。当然可以依次类推Array(x,y,z) 匹配数组有3个元素的等等....
  * 3)Array(0,_*) 匹配数组以0开始
  *
  * author : welldo 
  * date : 2020/1/10 15:05
  */
object ArrayMatch1 {
    def main(args: Array[String]): Unit = {

        val arrays = Array(
            Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1)
        )

        for (arr <- arrays) {
            val result = arr match {
                case Array(0) => "0" //匹配只有0的数组
                case Array(x, y) => x + "_" + y //匹配有两个元素的数组
                case Array(0, _*) => "以0开头的数组"
                case _ => "其他数组"
            }
            println("result = " + result)
        }

        println("+++++++++++++++++++++++++++++")

        //思考题: 给你一个数组集合，如果该数组时  Array(10,20), 返回Array(20,10)
        val arrays2 = Array(
            Array(0), Array(10, 20), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1)
        )
        for (elem <- arrays2) {
            val serializable = elem match {
                case Array(x, y) => ArrayBuffer(y, x)
                case _ => "... ..."
            }
            println(serializable)
        }
    }

}
