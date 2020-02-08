package com.welldo.study.chapter14.test

/**
  * scala中循环不建议使用while和do...while,而建议使用递归
  * 示例1:
  *     求1到1000w, 所有数字的和.
  *     使用递归的方式
  *
  *     通过两种方式对比耗时,可以看出,递归不会比常规方式费时更多.
  *
  * @author : welldo
  * date : 2020-02-08 18:00
  */
object DemoA2 {

    var endNum: BigInt = BigInt(10000000)

    def main(args: Array[String]): Unit = {
        println("递归方式")
        var num: BigInt = BigInt(1)
        var resulte: BigInt = BigInt(0)

        var startTime = System.currentTimeMillis()
        println("结果: "+count(num, resulte))
        val endTime = System.currentTimeMillis()

        println("耗时: " + (endTime - startTime) + "ms")
    }

    /**
      * 注意: 递归方法,最终的返回值,需要手写,不能类型推导
      */
    def count(num: BigInt, result: BigInt):BigInt = {
        if (num <= endNum) {
            count(num +1, result + num)
        }else{
            result
        }

    }

}
