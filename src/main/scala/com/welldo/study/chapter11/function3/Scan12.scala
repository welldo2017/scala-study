package com.welldo.study.chapter11.function3

/**
  * scan / scanLeft / scanRight, 也很有用
  * 扫描，本质也是fold, 即对某个集合的所有元素做fold操作，但是会把产生的所有中间结果放置于一个集合中,并返回
  *
  * author: welldo 
  * date: 2019/12/21 14:39
  */
object Scan12 {
    def main(args: Array[String]): Unit = {

        //step1.    List(1, 2, 3, 4, 5).fold(5)(minus _)
        //step2.    (5)
        //step3.    (5, 5-1)即 (5,4)
        //step4.    (5, 4, 4-2)即(5,4,2)
        //step5.    (5, 4, 2, 2-3)即(5,4,2,-1)
        //... ...   (5,4,2,-1,-5,-10)
        val seq = (1 to 5).scanLeft(5)(minus _)
        println(seq)

        //step1.    List(1, 2, 3, 4, 5).foldRight(5)(add _)
        // (5)
        // (5+5 , 5)
        //(4+10, 10, 5)
        //(20,19,17,14,10,5)
        val seq2 = (1 to 5).scanRight(5)(add _)
        println(seq2)
    }

    def minus(num1: Int, num2: Int): Int =  num1 - num2

    def add(num1: Int, num2: Int): Int =  num1 + num2
}
