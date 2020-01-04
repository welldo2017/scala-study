package com.welldo.study.chapter12.match1

/**
  * match 练习 1;
  *     说明了 默认匹配有多个时, 也不会报错
  *     虽然理论上, 除了第一个默认匹配有机会执行, 后面的默认匹配都无法执行.
  *     但是编译器没有报错
  *
  * author: welldo 
  * date: 2020/1/4 19:14
  */
object MatchExercise3 {
    def main(args: Array[String]): Unit = {
        //String 遍历出来后 , 是char类型
        val  str :String = "+-3!"

        for (ch <- str){
            var sign = 0
            var digit = 0

            ch match {
                case '+' => sign = 1
                case '-' => sign = -1

                // 多个默认匹配, 不会报错, 但是后面的默认匹配永远无法执行
                case _ => digit = 3
                case _ => sign = 2
            }

            //+ 1 0
            //- -1 0
            //3 0 3
            //! 0 3
            println(ch + "," + sign +"," +digit)
        }
    }

}
