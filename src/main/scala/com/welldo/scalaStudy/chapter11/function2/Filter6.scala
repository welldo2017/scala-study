package com.welldo.scalaStudy.chapter11.function2

/**
  * filter 过滤(使用频率很高)
  * 将符合要求的数据(筛选)放置到新的集合中
  *
  * def filter(p: A => Boolean)
  * p函数必须返回boolean类型, 某个元素被p运算后,
  * 如果为true, 这会加入到被返回的集合中
  * 如果为false, 则过滤掉
  *
  * 需求:
  * 将  val names = List("Alice", "Bob", "Nick") 集合中首字母为'A'的筛选到新的集合
  *
  * author welldo
  * date 2019/12/18
  */
object Filter6 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val result = names.filter(isBeginWithA _)
    println(result)
  }

  def isBeginWithA(word:String):Boolean={
    val bool = word.startsWith("A")
    bool
  }
}
