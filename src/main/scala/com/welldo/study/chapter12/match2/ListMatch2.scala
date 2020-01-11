package com.welldo.study.chapter12.match2

import scala.collection.mutable.ArrayBuffer

/**
  * 匹配列表
  *
  *
  * author : welldo 
  * date : 2020/1/10 15:05
  */
object ListMatch2 {
    def main(args: Array[String]): Unit = {
        val array = Array(
            List(0), List(1, 0), List(88), List(0, 0, 0), List(1, 0, 0)
        )

        for (list <- array) {
            val result = list match {
                // 匹配 只有一个元素, 且这个元素为0:  List(0)
                case 0 :: Nil => "List(0)"

                // 匹配 有两个元素的列表, 即List(x,y)
                case x :: y :: Nil => x + " " + y

                // 匹配 以0 开头的, 后面有任意元素的List(0,....) 这里的tail仅仅为名字, 随便起
                case 0 :: tail => "0开头, 后面任意 ..."

                // 匹配 只有一个元素的 list(x)
                case x :: Nil => List(x)

                case _ => "something else"

            }
            println(result)
        }
    }
}
