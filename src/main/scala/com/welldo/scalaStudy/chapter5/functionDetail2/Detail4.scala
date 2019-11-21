package com.welldo.scalaStudy.chapter5.functionDetail2

/**
  * 4)因为Scala可以自行推断，所以在省略return关键字的场合，返回值类型也可以省略
  * *
  * 5)如果函数明确使用return关键字，那么函数返回就不能使用自行推断了,
  * 这时要明确写成 : 返回类型 =  ，
  * 当然如果你什么都不写，即使有return 返回值为()
  *
  * @author welldo
  *         2019/11/21
  */
object Detail4 {

  def main(args: Array[String]): Unit = {
    println(test11())


  }

  //返回值类型的地方, 如果你什么都不写，即使有return 返回值为()
  def test11(){
    return 30
  }

  //5)如果函数明确使用return关键字，那么函数返回就不能使用自行推断了,
  // 这时要明确写成 : 返回类型 =  ，
  def test1(): Int = {
    // xxx
    // xxx
    return 30
  }

  //* 4)因为Scala可以自行推断，所以在省略return关键字的场合，返回值类型也可以省略
  //也可以不省略
  def test2() = {
    // xxx
    // xxx
    30
  }


}