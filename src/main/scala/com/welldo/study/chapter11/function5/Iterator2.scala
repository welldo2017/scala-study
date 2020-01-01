package com.welldo.study.chapter11.function5

/**
  * 迭代器
  * 通过iterator方法从集合获得一个迭代器，通过while和for对集合进行遍历
  * iterator 的构建实际是 AbstractIterator 的一个匿名子类，
  *
  * author: welldo 
  * date: 2020/1/1 15:44
  */
object Iterator2 {
    def main(args: Array[String]): Unit = {
        val iterator = List(1, 2, 3, 4, 5).iterator //  获取到迭代器 [链表实现]
        println("--------遍历方式1 -----------------")
        while (iterator.hasNext) { // hasNext 方法可以判断是否有下一个
            println(iterator.next()) // next 取出下一个值
        }
        //注意, while遍历完后, 指针已经到了最后,
        //再遍历, 则为空

        println("--------遍历方式2 for -----------------")
        for(enum <- iterator) {
            println(enum) //
        }
    }

}
