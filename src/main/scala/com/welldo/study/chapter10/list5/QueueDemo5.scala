package com.welldo.study.chapter10.list5

import scala.collection.mutable

/**
  * 队列 QUEUE
  * 如果不需要取出queue中的元素, 仅仅想查询(queue不会发生变化), 怎么做呢?
  *
  * author: welldo 
  * date: 2019/12/14 15:52
  */
object QueueDemo5 {
    def main(args: Array[String]): Unit = {
        //1. 创建
        val queue = new mutable.Queue[Any]
        queue.enqueue(1,2,3,"a","b","c")
        println(queue)

        //2. 查询第一个元素
        println(queue.head)
        //3. 查询最后一个元素
        println(queue.last)

        //4.返回队列的尾部(尾部: 除了第一个元素, 剩下的元素组成的队列),tail可以级联使用
        println(queue.tail)
        println(queue.tail.tail)
        println(queue.tail.tail.tail)
    }
}
