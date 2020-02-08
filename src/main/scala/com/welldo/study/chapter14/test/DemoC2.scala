package com.welldo.study.chapter14.test

/**
  * 翻转字符串
  *
  * author : welldo
  * date : 2020-02-08 21:10
  */
object DemoC2 {
    def main(args: Array[String]): Unit = {
        val str = "12345"

        //使用递归的方式
        println(myReverse(str))
    }

    /**
      * 步骤
      * myReverse(12345)
      * myReverse(2345) + 1
      * myReverse(345) + 2 +1
      * myReverse(45) +3+2+1
      * myReverse(5) + 4+3+2+1
      * 5+4+3+2+1
      *
      */
    def myReverse(xs: String): String = {
        if (xs.length == 1 || xs.length == 0)
            xs
        else
            myReverse(xs.tail) + xs.head
    }

}
