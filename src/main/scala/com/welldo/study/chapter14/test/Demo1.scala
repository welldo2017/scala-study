package com.welldo.study.chapter14.test

/**
  * scala中循环不建议使用while和do...while,而建议使用递归
  * 示例1:
  *     求1到1000w, 所有数字的和.使用常规方式.
  *
  * @author : welldo
  * date : 2020-02-08 18:00
  */
object Demo1 {
    def main(args: Array[String]): Unit = {
        var count: BigInt = BigInt(1)
        var endNum: BigInt = BigInt(10000000L)

        var resulte:BigInt = BigInt(0)

        var startTime = System.currentTimeMillis()
        while (count <= endNum){
            resulte += count
            count += 1
        }
        val endTime = System.currentTimeMillis()

        println(resulte)
        println("耗时: "+ (endTime - startTime) +"ms")
    }

}
