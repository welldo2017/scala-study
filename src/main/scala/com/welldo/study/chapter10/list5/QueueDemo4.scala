package com.welldo.study.chapter10.list5

import scala.collection.mutable

/**
  * 队列 QUEUE
  * 这里主要讲应用, 不讲原理
  *
  * 1)队列是一个有序列表，在底层可以用数组或是链表来实现。
  * 2)其输入和输出要遵循先入先出的原则。默认加在队列的最后
  * 4)在scala中, 有 scala.collection.mutable.Queue 和 scala.collection.immutable.Queue ,
  * 一般来说，通常使用可变集合中的队列
  *
  * author: welldo 
  * date: 2019/12/14 15:52
  */
object QueueDemo4 {
    def main(args: Array[String]): Unit = {

        // 入队列
        println("=========入队列=========")
        //1. 创建
        val queue = new mutable.Queue[Any]
        println(queue)

        // 2. 添加
        queue += 1
        queue += 2
        println(queue)

        //3. 添加(因为定义时, 泛型为any, 所以可以添加List类型)
        queue += List(4, 5, 6)
        println(queue)

        //4. 把List中的元素拿出来, 一个一个添加, 使用 ++=
        queue ++= List("a","b")
        println(queue)

        //5.
        queue.enqueue(100,100,100)
        println(queue)

        //出队列, 从头部取出数据, queue本身会发生变化
        println("=========出队列=========")
        val first = queue.dequeue()
        val second = queue.dequeue()
        val third = queue.dequeue()
        println("取出第一个元素: "+first)
        println("取出第2个元素: "+second)
        println("取出第3个元素: "+third)
        println(queue)
    }
}
