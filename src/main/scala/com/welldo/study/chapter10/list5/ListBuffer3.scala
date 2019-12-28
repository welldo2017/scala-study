package com.welldo.study.chapter10.list5

import scala.collection.mutable.ListBuffer

/**
  * ListBuffer是可变的list集合，可以添加，删除元素, ListBuffer属于序列
  *
  * author: welldo 
  * date: 2019/12/14 15:21
  */
object ListBuffer3 {
    def main(args: Array[String]): Unit = {
        //访问
        val lb1 = ListBuffer[Int](1, 2, 3)
        println("lb1(2)=" + lb1(2))
        println(lb1)

        //遍历
        println("=========foreach=========")
        for (elem <- lb1) {            println(elem)        }

        //添加1 添加元素
        println("=========add1=========")
        val lb2 = new ListBuffer[Int]
        lb2 += 4 //lb2(4)
        lb2.append(5) //lb2(4,5)
        println(lb2)

        //添加2 添加集合, 目标集合++= 集合, 是将集合中的各个元素,拿出来, 一个一个添加到目标集合中
        println("=========add2=========")
        lb1 ++= lb2
        println(lb1)


        //
        println("=========返回新的对象1, 集合添加集合=========")
        val lba = ListBuffer[Any]("a", "b", "c")
        val lbb = ListBuffer[Any]("d", "e")
        val buffer = lba ++ lbb
        println(lba)
        println(lbb)
        println(buffer)


        //添加3 添加元素,  :+ , 和ListDemo2 中的:+ 一样, 注意, 这里返回新的对象
        println("=========返回新的对象2, 集合添加元素=========")
        val bufferAdd = lba :+ "后面"
        println(lba)
        println(bufferAdd)

        //删除
        println("=========delete=========")
        bufferAdd.remove(0)
        println(bufferAdd)
    }
}
