package com.welldo.study.chapter12.cassclass5

/**
  * 样例类最佳实践1: 模式匹配(apply 和 unapply方法)
  *
  * 当我们有一个类型为Amount的对象时，可以用模式匹配来匹配他的类型，并将属性值绑定到变量
  * 即：把样例类对象的属性值提取到某个变量
  *
  * author : welldo 
  * date : 2020/1/11 17:02
  */
object Demo2 {
    def main(args: Array[String]): Unit = {
        val array = Array(Dollar2(1000.0), Currency2(1000.0, "RMB"), NoAmount2)

        for (amt <- array) {
            val result = amt match {
                //对象匹配 Dollar(1000.0)
                case Dollar2(v) => "$" + v
                //对象匹配 Currency(1000.0, "RMB")
                case Currency2(v, u) => v + ", " + u
                case NoAmount2 => "==="
            }
            println(amt + ": " + result)
        }
    }
}


abstract class Amount2{}
//查看反编译, 底层也会生成 Dollar2.class 和 Dollar2$.class
case class Dollar2(value: Double) extends Amount2{}
case class Currency2(value: Double, unit: String) extends Amount2{}

//样例object 生成的方法会少一点, 后面详细讲解.
case object NoAmount2 extends Amount2{}