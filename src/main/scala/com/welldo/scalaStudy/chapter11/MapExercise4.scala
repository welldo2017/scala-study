package com.welldo.scalaStudy.chapter11

/**
  * 请将 val names = List("Alice", "Bob", "Nick") 中的所有单词，全部转成字母大写，
  * 返回到新的List集合中.
  *
  * tips: 想知道某个高阶函数, 需要一个什么样的参数, ctrl +P 进行展示
  *
  * author welldo
  * date 2019/12/18
  */
object MapExercise4 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val upperNames = names.map(myUpper _)
    println(upperNames)
  }

  //将传进来的单词变成大写
  def myUpper(word:String) :String={
    word.toUpperCase
  }

}
