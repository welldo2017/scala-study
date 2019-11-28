package com.welldo.scalaStudy.chapter5.functionDetail2

/**
  * 9. Scala函数的形参，在声明参数时，直接赋初始值(默认值)，
  * 这时调用函数时，如果没有传入参数,则会使用默认值。
  * 如果传入了实参，则实参会覆盖默认值
  *
  * @author welldo
  *         2019/11/23
  */
object Detail9 {

  def main(args: Array[String]): Unit = {

    //使用默认值
    getCity()

    //传入参数, 覆盖默认值
    getCity("peking")

  }

  def getCity(s: String = "四川成都"): Unit = {
    println("city is :" + s)
  }






}