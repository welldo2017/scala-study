package com.welldo.scalaStudy.chapter10.map6


/**
  * 不可变的map, 进行增删改后, 自身是不会变的, 变化的是返回的结果
  *
  * author: welldo
  * date: 2019/12/14 16:39
  */
object MapDemo4 {
    def main(args: Array[String]): Unit = {
        //todo why?????
        //todo + 和 += 到底有什么区别???
        var map = Map[Char, Int]()
        map += ('a' -> 1)
        map += ('b' -> 2)
        println(map)

        var map2 = Map[Char, Int]()
        map2 + ('a' -> 1)
        map2 + ('b' -> 2)
        println(map2)
    }
}
