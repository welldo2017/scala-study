package com.welldo.scalaStudy.chapter7.scalaPackage1

/**
  * scala包的快速入门
  *
  * 现在要分别使用 x包下和y包下的tiger类
  * @author welldo
  *  2019/11/28
  */
object UseTiger {
  def main(args: Array[String]): Unit = {

    //如果是java, 在类型的部分, 要写完整
    //得益于scala的类型推导, 这里省略类型, 简洁
    val tiger1 = new com.welldo.scalaStudy.chapter7.scalaPackage1.x.Tiger
    val tiger2 = new com.welldo.scalaStudy.chapter7.scalaPackage1.y.Tiger

    //打印后可以看出, 类型中的包名完整
    println(tiger1)
    println(tiger2)
  }
}
