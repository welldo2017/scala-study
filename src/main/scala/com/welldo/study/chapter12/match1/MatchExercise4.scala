package com.welldo.study.chapter12.match1

/**
  * match 练习 2;
  *     说明: 默认匹配放在第一行时, 就直接拦住了所有.
  *     后面的匹配永远无法执行, 但是编译器不报错
  *
  * author: welldo 
  * date: 2020/1/4 19:14
  */
object MatchExercise4 {
    def main(args: Array[String]): Unit = {
        val  str :String = "+-3!"

        for (ch <- str){
            var sign = 0
            var digit = 0

            ch match {
                case _ => digit = 3
                case '+' => sign = 1
                case '-' => sign = -1
            }
            println(ch + "," + sign +"," +digit)
        }
    }

}
