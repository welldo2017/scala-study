package com.welldo.scalaStudy.chapter11.function4

/**
  * 拉链
  *
  * 拉链的使用注意事项
  * 1) 拉链的本质就是两个集合的合并操作，合并后每个元素是一个 对偶元组。
  * 3) 如果两个集合个数不对应，会造成数据丢失。
  * 4) 集合不限于 List, 也可以是其它集合比如 Array
  * 5) 如果要取出合并后的各个对偶元组的数据，可以遍历
  *
  * author: welldo 
  * date: 2019/12/21 16:55
  */
object Zip1 {
    def main(args: Array[String]): Unit = {

        //拉链的基本使用-合并
        val list = List("no1", "no2", "no3") // 文件
        val list2 = List("北京", "上海", "广州") // 数据库

        val list3 = list zip list2
        println(list3)

        //结果遍历
        for (item <- list3) {
            println("编号=" + item._1 + ", 名字=" + item._2)
        }

    }

}
