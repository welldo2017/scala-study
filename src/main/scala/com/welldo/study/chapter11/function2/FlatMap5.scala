package com.welldo.study.chapter11.function2

/**
  * flatmap映射：flat即压扁，压平，扁平化映射
  * def flatMap[B, That](f: A => GenTraversableOnce[B])
  *
  * 将集合中的每个元素, 一个一个拿出来, 被f函数运算, 将运算后的结果,放到新的集合中返回
  * 如果集合中还有集合, 那么也会拿出来(底层递归操作)
  *
  * author welldo
  * date 2019/12/18
  */
object FlatMap5 {
  def main(args: Array[String]): Unit = {
    //todo 总觉得没有讲清楚.
    //此集合中3个字符串, 由于字符串又是char的集合,
    //相当于把 alice 这个集合中的每一个char拿出来, 执行upper函数, 得到结果
    //以此类推
    val names = List("Alice", "Bob", "Nick")
    val upperName = names.flatMap(upper _)
    println(upperName)
  }

  //todo 为什么能兼容 def upper( s : char ) : char
  def upper( s : String ) : String = {
    s. toUpperCase
  }

}
