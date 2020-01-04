package com.welldo.study.chapter12.match1

/**
  * 类型匹配注意事项
  *     1)Map[String, Int] 和Map[Int, String]从形式上不同，底层会进行类型擦除。List也会进行类型擦除
  *     2)在进行类型匹配时，如果是简单代码, 编译器会预先检测是否有可能的匹配，如果没有则 编译时报错.
  *
  * author: welldo
  * date: 2020/1/4 18:41
  */
object MatchDemo8 {
    def main(args: Array[String]): Unit = {


    }

}
