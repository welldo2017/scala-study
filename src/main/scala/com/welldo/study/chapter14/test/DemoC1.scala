package com.welldo.study.chapter14.test

/**
  * 翻转字符串
  *
  * author : welldo
  * date : 2020-02-08 21:10
  */
object DemoC1 {
    def main(args: Array[String]): Unit = {
        val str = "hello"

        //方法1. scala api
        println(str.reverse)


        //方法2. 使用scala的常规方式
        var result = ""
        for (elem <- 0 until str.length  reverse) {
            result += str.charAt(elem)
        }
        println(result)

    }

}
