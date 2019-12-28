package com.welldo.study.chapter5.lazyFunction4

/**
  * 惰性计算（尽可能延迟表达式求值）是许多函数式编程语言的特性。
  * 惰性集合在需要时提供其元素，无需预先计算它们，这带来了一些好处。
  * 首先，您可以将耗时的计算推迟到绝对需要的时候。
  * 其次，您可以创造无限个集合，只要它们继续收到请求，就会继续提供元素。
  * 函数的惰性使用让您能够得到更高效的代码。
  * Java 并没有为惰性提供原生支持，Scala提供了。
  *
  *
  * 注意事项:
  *   lazy 不能修饰 var 类型的变量, 只能修饰 val
  *   lazy修饰函数 ,会导致函数的执行被推迟;
  *   lazy修饰变量 ,那么变量值的分配也会推迟。
  *   比如 lazy val i = 10, 其实这里并没有真正赋值, 只有当 变量i 被使用的时候 才会被赋值
  *
  * author: welldo
  * date: 2019/11/23 14:39
  */
object LazyDemo1 {

  def main(args: Array[String]): Unit = {
    //当非lazy的时候, 则按照顺序依次执行
    //依次输出: sum 被调用; -----; 最终结果
    val res = sum(1, 2)
    println("-----------------------")
    println("res=" + res)

    println("分隔符")

    //使用lazy的时候
    //依次输出: ------; 被调用; 最终结果
    lazy val resLazy = sum(1, 2)
    println("-----------------------")
    println("resLazy=" + resLazy)//当需要使用到res时，就会真正的开始计算

  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum 被调用..")
    n1 + n2
  }

}
