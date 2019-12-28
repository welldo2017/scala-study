package com.welldo.study.chapter11.function3

import scala.collection.mutable.ArrayBuffer

/**
  * 综合应用: 练习1
  *
  * val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
  * 将sentence 中每个字符，通过 foldLeft 存放到 一个ArrayBuffer中
  * 目的：理解 foldLeft 的用法.
  *
  * author: welldo 
  * date: 2019/12/21 15:14
  */
object comprehensiveExercise1 {
    def main(args: Array[String]): Unit = {

        val sentence = "abbcccdddd"

        val ab = ArrayBuffer[Char]()
        sentence.foldLeft(ab)(saveChar _)
        println(ab)
    }


    def saveChar(ab: ArrayBuffer[Char], char:Char)={
        ab.append(char)
        ab
    }
}
