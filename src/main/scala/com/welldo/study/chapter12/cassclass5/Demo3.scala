package com.welldo.study.chapter12.cassclass5

/**
  * 样例类最佳实践2: copy方法, tostring方法
  *
  * author : welldo 
  * date : 2020/1/11 17:02
  */
object Demo3 {
    def main(args: Array[String]): Unit = {
        val amt = Currency3(29.95, "RMB")
        // 默认使用原来的值, 相当于 clone
        val amt1 = amt.copy()

        // 使用带名参数, 其它的属性值 不变
        val amt2 = amt.copy(value = 19.95)
        val amt3 = amt.copy(unit = "英镑")
        println(amt1)// 默认调用 toString()
        println(amt2)
        println(amt3)

    }
}


abstract class Amount3
case class Dollar3(value: Double) extends Amount3
case class Currency3(value: Double, unit: String) extends Amount3
case object NoAmount3 extends Amount3