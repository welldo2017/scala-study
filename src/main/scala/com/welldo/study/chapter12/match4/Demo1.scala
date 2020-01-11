package com.welldo.study.chapter12.match4

/**
  * 变量声明 中的 模式匹配
  *     match中每一个case都可以单独提取出来，意思是一样的.
  *
  * author : welldo 
  * date : 2020/1/11 15:12
  */
object Demo1 {
    def main(args: Array[String]): Unit = {
        //如果不使用模式匹配来声明变量, 那么定义变量 如下
        val x:Int = 10
        val y:Int = 20
        val z:String = "emmm"

        //使用模式匹配
        val (a,b,c) = (10,20,"emm")
        println(a)
        println(b)
        println(c)

        println("=============")

        val arr = Array(1, 7, 2, 9)
        // 提出arr的前两个元素
        val Array(first, second, _*) = arr
        println(first, second) // 1, 7
    }

}
