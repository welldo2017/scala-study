package com.welldo.study.chapter12.match1

/**
  * 模式中的变量
  *     如果在case 后跟变量名，那么match 前表达式的值, 会赋给那个变量
  *
  * author: welldo
  * date: 2020/1/4 18:41
  */
object MatchDemo5 {
    def main(args: Array[String]): Unit = {

        //依次将 ch 赋值为  x,y
        val ch = 'y'

        ch match {
            case 'x' => println("普通模式匹配------")

            // 将 ch 赋值给变量 mychar, mychar = ch
            // 再来匹配, 所以, 肯定能匹配上
            case mychar => println("模式匹配中的变量赋值" + mychar)

            //case _ => println ("ok~~永远不会走到这一步")
        }
    }
}
