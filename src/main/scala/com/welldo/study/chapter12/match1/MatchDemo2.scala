package com.welldo.study.chapter12.match1

/**
  * Scala的模式匹配
  *     case _ if() ... 这里不是默认匹配, 这是匹配守卫
  *
  *
  * author: welldo
  * date: 2020/1/4 18:41
  */
object MatchDemo2 {
    def main(args: Array[String]): Unit = {

        for (ch <- "+-3!") {
            var sign = 0
            var digit = 0
            ch match {
                case '+' => sign = 1
                case '-' => sign = -1

                //1. 匹配守卫, 表示忽略 ch的值, 只判断if的条件表达式, 如果为true, 这一轮的ch 就匹配这里
                case _ if false  => digit = 3

                //默认匹配
                case _ => sign = 2
            }

            // + 1 0
            // - -1 0
            // true : 3 0 3 / false: 3 2 0
            // ! 2 0
            println(ch + " " + sign + " " + digit)
        }

    }

}
