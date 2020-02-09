package com.welldo.study.chapter5.recursion6

/**
  * 求出List中的最大值
  *
  * author : welldo
  * date : 2020-02-08 20:26
  */
object DemoB {
    def main(args: Array[String]): Unit = {
        val list = List(3, 5, 1, 93, 99, 80)

        //用sdk自带的方式
        println(list.max)

        //用递归的方式
        println(list.head)
        println(list.tail)

    }

    /**
      * 流程
      * step1. 3 > myMax(5, 1, 93, 99, 80)      step11. 返回99
      * step2.    5 > myMax( 1, 93, 99, 80)     step10. 返回99
      * step3.         1 > myMax( 93, 99, 80)   step9. 返回99
      * step4.             93 > myMax( 99, 80)  step8. 返回99
      * step5.                  99> myMax(80)     step7. 返回99
      * step6.                       80            step6. 返回80
      *
      *
      */
    def myMax(xs: List[Int]): Int = {
        if (xs.isEmpty)
            throw new java.util.NoSuchElementException
        if (xs.size == 1)
            xs.head
        else if (xs.head > myMax(xs.tail)) {
            xs.head
        } else
            myMax(xs.tail)
    }

}
