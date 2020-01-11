package com.welldo.study.chapter12.match4

/**
  * for循环 中的 模式匹配
  *     编译后, 底层任然是 match case
  *
  * author : welldo 
  * date : 2020/1/11 15:12
  */
object Demo2 {
    def main(args: Array[String]): Unit = {
        val map = Map("A"->1, "B"->0, "C"->3) //map集合
        // 不使用模式匹配, for循环 这样写
        for (elem <- map) {
            println(elem._1 + " --> " + elem._2)
        }

        println("for循环中的模式匹配==============")
        // 使用模式匹配, for循环
        for ( (k, v) <- map ) { //每次遍历，取出k和v
            println(k + " --> " + v)
        }

        println("进行过滤==============")
        //说明: 只会取出 value= 0 的 k-v
        for ((k, 0) <- map) {
            println(k + " --> " + 0)
        }


        println("表达式判断, 进行过滤==============")
        //说明 取出 value 在 [0,3] 的范围的 key-val
        for ((k, v) <- map if v > 0 && v < 3) {
            println(k + " --> " + v)
        }
    }

}
