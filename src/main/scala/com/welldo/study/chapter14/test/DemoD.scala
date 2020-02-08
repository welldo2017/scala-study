package com.welldo.study.chapter14.test

/**
  * 求阶乘
  *
  * author : welldo
  * date : 2020-02-08 21:52
  */
object DemoD {
    def main(args: Array[String]): Unit = {
        println(myJie(5))

    }

    /**
      * 阶乘
      * (0的阶乘为1)
      */
    def myJie(num:Int):Int={
        if (num == 1 || num == 0) {
            1
        }else{
             num * myJie(num -1)
        }

    }

}
