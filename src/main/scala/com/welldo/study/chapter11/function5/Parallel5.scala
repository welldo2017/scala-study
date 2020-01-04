package com.welldo.study.chapter11.function5

/**
  * Parallel 并行计算
  *
  * 基本介绍
  * 1)Scala为了充分使用多核CPU，提供了并行集合（有别于前面的串行集合），用于多核环境的并行计算。
  * 2)主要用到的算法有：
  *     Divide and conquer : 分治算法，Scala通过splitters(分解器)，combiners(组合器)等抽象层来实现，
  *     主要原理是将计算工作分解很多任务，分发给一些处理器去完成，并将它们处理结果合并返回
  *
  *     Work stealin算法(工作窃取算法)，主要用于任务调度负载均衡（load-balancing），
  *     通俗点完成自己的所有任务之后，发现其他人还有活没干完，主动（或被安排）帮他人一起干，这样达到尽早干完的目的
  *
  * author: welldo 
  * date: 2020/1/4 17:39
  */
object Parallel5 {

    //应用案例1. 查看并行集合中元素访问的线程
    def main(args: Array[String]): Unit = {

        val result1 = (0 to 100).map{case _ => Thread.currentThread.getName}.distinct
        val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}.distinct
        println(result1)
        println(result2)//本计算机有几个core,就会出现多少个结果
    }

}
