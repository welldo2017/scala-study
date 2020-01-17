package com.welldo.study.chapter13.parameterinfer4

/**
  * 参数推断:
  * 在某些特殊的场景下, 参数的类型是可以推断出来的, 也就是可以进行简写
  *
  * 简写规则:
  * 1)参数类型是可以推断时，可以省略参数类型
  * 2)当传入的函数，只有单个参数时，可以省去括号
  * 3)如果变量只在=>右边只出现一次，可以用_来代替
  *
  * author : welldo 
  * date : 2020/1/17 14:37
  */
object Demo2 {
    def main(args: Array[String]): Unit = {
        //需求2, 将list中的元素, 进行累加
        val list = List(1, 2, 3, 4, 5)

        //step1. 最完整的写法
        val step1 = list.reduceLeft(accumulation _)

        //step2. 变成匿名函数的形式
        val step2 = list.reduceLeft((n1: Int, n2: Int) => n1 + n2)

        //step3. 匿名函数中, 省略参数类型
        val step3 = list.reduceLeft((n1, n2) => n1 + n2)

        //step4. 注意: 匿名函数中传入两个参数, 所以括号 不能省略

        //step5. 如果变量只在=>右边只出现一次，可以用_来代替
        val step5 = list.reduceLeft(_ + _)

        println(step1)
        println(step2)
        println(step3)
        println(step5)
    }

    //累加
    def accumulation(n1: Int, n2: Int) = {
        n1 + n2
    }

}
