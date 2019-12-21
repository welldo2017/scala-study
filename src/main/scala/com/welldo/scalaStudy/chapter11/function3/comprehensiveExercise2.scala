package com.welldo.scalaStudy.chapter11.function3
import scala.collection.mutable

/**
  * 综合应用: 练习2, 使用scala实现
  *
  * val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
  * 使用映射集合，统计一句话中，各个字母出现的次数
  * 提示：Map[Char, Int](),
  *
  * author: welldo
  * date: 2019/12/21 15:47
  */
object comprehensiveExercise2 {
    def main(args: Array[String]): Unit = {
        val sentence = "abbcccddddeeeee"

        //不可变map实现
        var map = Map[Char, Int]()
        val map2 = sentence.foldLeft(map)(count _)
        println(map2)

        //可变map实现
        val map3 = mutable.Map[Char, Int]()
        sentence.foldLeft(map3)(mutableCount _)
        println(map3)
    }



    //这里用的是不可变的map, 每次返回新的map, 效率相对较低
    def count(map:Map[Char, Int], char: Char):Map[Char, Int]={
        val newMap = map + (char -> (map.getOrElse(char,0) +1) )
        newMap
    }

    //todo 请看 /chapter10/map6/MapDemo4.scala 中的困惑
    //用可变map来实现
    def mutableCount(map:mutable.Map[Char, Int], char: Char) :mutable.Map[Char, Int]={
        map += (char -> (map.getOrElse(char,0) +1) )
    }

}
