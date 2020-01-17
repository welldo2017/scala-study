package com.welldo.study.chapter13.parameterinfer4

/**
  * 参数推断:
  *     在某些特殊的场景下, 参数的类型是可以推断出来的, 也就是可以进行简写
  *
  * 简写规则:
  *     1)参数类型是可以推断时，可以省略参数类型
  *     2)当传入的函数，只有单个参数时，可以省去括号
  *     3)如果变量只在=>右边只出现一次，可以用_来代替
  *
  *
  * author : welldo 
  * date : 2020/1/17 14:05
  */
object Demo1 {
    def main(args: Array[String]): Unit = {

        //需求, 将list中的元素, 进行 +10
        //下面我们一步一步进行简写
        val list = List(1, 2, 3, 4, 5)

        //step1. 最完整的写法
        val step1 = list.map(addTen(_))

        //step2. 变成匿名函数的形式
        val step2 = list.map((x: Int) => x + 10)

        //step3. 匿名函数中, 省略参数类型
        val step3 = list.map((x) => x + 10)//符合规则1

        //step4. 匿名函数中, 省略参数类型, 再省略括号
        val step4 = list.map(x => x + 10)//符合规则2

        //step5. 如果变量只在=>右边只出现一次，可以用_来代替
        val step5 = list.map( _ + 10)// 符合规则3

        println(step1)
        println(step2)
        println(step3)
        println(step4)
        println(step5)
    }

    //+10
    def addTen(num: Int) = {
        num + 10
    }

}
