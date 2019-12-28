package com.welldo.study.chapter5.recursion3

/**
  * 有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
  * 以后每天猴子都吃其中的一半，然后再多吃一个。
  * 当到第十天时，想再吃时（还没吃），发现只有1个桃子了。问题：最初共多少个桃子？
  * @author welldo
  *  2019/11/20
  */
object exercise3 {
  def main(args: Array[String]): Unit = {
    countPeach(1,9)
    println(countPeach2(1))
  }

  /**
    * 1. day=10 有1
    * 2. day=9  (day10 + 1) * 2 = (1+1) * 2 = 4
    * 3. day=8  (day9 + 1) * 2 ....
    */
  def countPeach2(day:Int): Int ={
    if (day == 10){
      1
    }else{
        (countPeach2(day +1) +1 )*2
    }
  }

  /**
    * 反向计算
    * 传入 第N天剩下的桃子, 和第N天
    * 第9天只剩下了一个桃子,所以初始值应该传入: 1,9
    */
  def countPeach (countOfDay: Int,day:Int):Unit ={
    if (day >= 1){
      countPeach(  (countOfDay +1 )*2, day -1 )
    }
    println("n= "+countOfDay)
  }

}
