package com.welldo.study.chapter10.map6

import scala.collection.mutable

/**
  * 不可变Map 不能增删改
  *
  * 可变Map 的增删改
  * 1. 修改: 修改的时候是upsert机制
  * 2. 添加: 使用 += 添加单个元素, 或者多个元素. 添加的时候, 也是upsert机制
  * 3. 删除: 使用 -= 删除单个元素, 或者多个元素, 如果key不存在, 也不报错
  *
  * author: welldo
  * date: 2019/12/14 16:39
  */
object MapDemo2 {
    def main(args: Array[String]): Unit = {
        //1. 不可变集合, 不能增删改, 此处不举例

        //2. 可变集合, 修改
        println("=========update=========")
        val map3 = mutable.Map[String,Any]("a" -> 10, "b" -> 20, "c" -> 30)
        map3("a") = "update" //修改
        map3("A") = "add" //添加
        println(map3)

        //3. 可变集合, 添加
        println("=========add=========")
        val map4 = mutable.Map[String,Any]("a" -> 10, "b" -> 20, "c" -> 30)
        map4 += ("d" -> 40)
        map4 += ("e" -> 50, "f" ->60)
        map4 += ("a" -> "update")
        println(map4)

        //4. 删除,
        map4 -= ("e", "f")
        map4 -= ("aaa")
        println(map4)
    }
}
