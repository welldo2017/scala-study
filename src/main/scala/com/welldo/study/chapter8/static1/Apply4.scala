package com.welldo.study.chapter8.static1

/**
  * 传统方法, 使用new 关键字创建对象
  * 在伴生对象中定义apply方法，可以实现： 类名(参数) 方式来创建对象实例.
  *
  * author: welldo 
  * date: 2019/12/8 16:39
  */
object Apply4 {
    def main(args: Array[String]): Unit = {
        //使用传统方法创建对象(不使用apply)
        val pig = new Pig("传统猪猪")

        //使用apply方法创建对象
        val pig1 = Pig("有参apply猪猪")
        val pig2 = Pig()

        println(pig.name)
        println(pig1.name)
        println(pig2.name)
    }
}


class Pig(cName:String){
    var name :String=cName
}

object Pig{
    //apply方法可以重载
    def apply(cName: String): Pig = new Pig(cName)

    def apply(): Pig = new Pig("无参apply猪猪")
}
