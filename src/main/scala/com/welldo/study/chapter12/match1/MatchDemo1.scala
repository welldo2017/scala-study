package com.welldo.study.chapter12.match1

/**
  * Scala的模式匹配
  *      1. match是一个关键字
  *             使用方法:  x match{ ... }
  *             x 可以是字符, 可以是表达式
  *      1. case 是一个关键字, 后面跟上 需要和 x 对比的常量
  *             使用方法:  case 常量a => 代码块
  *      2. 匹配的顺序是从上到下, 匹配到就执行对应的代码块(代码块有无大括号{}都行)
  *             并且无需break,执行完后, 会自动退出match
  *      3. case _ 表示默认匹配, 如果一个都没有匹配到, 则执行case _ 后面的代码块
  *      4. 在scala中，如果没有匹配到任何case ,又没有 case _ ,就会抛出MatchError
  *
  * author: welldo
  * date: 2020/1/4 18:41
  */
object MatchDemo1 {
    def main(args: Array[String]): Unit = {

        val operator = '-'
        //val operator = '^'

        val n1 = 20
        val n2 = 10
        var res = 0

        operator match {
            case '+' => res = n1 + n2
            case '-' => {
                res = n1 - n2
            }
            case '*' => res = n1 * n2
            case '/' => res = n1 / n2
            case _ => println("oper error")
        }
        println("res=" + res) //10

    }

}
