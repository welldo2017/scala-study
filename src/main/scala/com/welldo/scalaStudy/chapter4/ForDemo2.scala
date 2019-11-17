package com.welldo.scalaStudy.chapter4

/**
  * author: welldo 
  * date: 2019/11/17 16:17
  *
  * 循环守卫 和 引入变量
  */
object ForDemo2 {

  /**
    * 1)循环守卫，即循环保护式（也称条件判断式，守卫）。
    * 保护式为true则进入循环体内部，为false则跳过，类似于continue
    */
  def main(args: Array[String]): Unit = {

    println("循环守卫的方式=================")
    for(i <- 1 to 3 if i != 2) {
      println("守卫: "+ i )
    }

    //等价于这种
    println("普通方式=================")
    for (i<-1 to 3){
      if ( i != 2) {
        println("普通: "+ i )
      }
    }


    //引入变量
    println("引入变量=================")
    for(i <- 1 to 3; j = 4 - i) {
      println("引入变量: "+ j )
    }

    //等价于这种
    for (i <- 1 to 4) {
      val j = 4 - i
      println(s"i=${i} j=${j}")
    }


  }


}
