package com.welldo.study.chapter12.match1

/**
  * 模式匹配返回值
  *     因为match 是一个表达式, 所以有返回值
  *     返回值就是匹配到的代码块中的最后一行代码
  *
  * author: welldo
  * date: 2020/1/4 18:41
  */
object MatchDemo6 {
    def main(args: Array[String]): Unit = {

        val ch = '-'

        val res = ch match {
            case '+' => "hello"
            case '-' => {
                println("代码块中的最后一行 作为返回值")
                1+1
            }
            case _ => println ("默认值")
        }
        println(res)

    }

}
