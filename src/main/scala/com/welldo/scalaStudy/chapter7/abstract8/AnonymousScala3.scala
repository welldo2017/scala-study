package com.welldo.scalaStudy.chapter7.abstract8

/**
  * scala 匿名子类, 和java基本一致
  *
  * author: welldo 
  * date: 2019/12/8 13:02
  */
object AnonymousScala3 {
    def main(args: Array[String]): Unit = {

        val monster = new Monster {
            override var name: String = "孙悟空"

            override def cry(): Unit = {
                println("妖怪来了,要吃人")
            }
        }
        println("妖怪的姓名是: "+monster.name)
        monster.cry()
    }
}

abstract class Monster {
    var name: String

    def cry()
}