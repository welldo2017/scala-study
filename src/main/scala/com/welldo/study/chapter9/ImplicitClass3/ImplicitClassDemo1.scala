package com.welldo.study.chapter9.ImplicitClass3

/**
  * 三. 隐式类
  *
  * 在scala2.10后提供了隐式类，可以使用implicit声明类，
  * 隐式类非常强大，同样可以扩展类的功能，比前面使用隐式转换丰富类库功能更加的方便，
  * 在集合中隐式类会发挥重要的作用。
  *
  * 注意:
  * 1)其所带的构造参数, 有且只有一个
  * 2)隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是 顶级的(top-level  objects)
  * 3)隐式类不能是case class（case class在后续介绍 样例类）
  * 4)作用域内不能有与之相同名称的标识符
  *
  * author: welldo
  * date: 2020/1/1 13:49
  */
object ImplicitClassDemo1 {

    def main(args: Array[String]): Unit = {
        val mySQL = new MySQL1
        //调用自己的方法
        mySQL.sayOk()

        //mySQL能调用DB1 的方法, 那么肯定是 将mysql类转换成 DB1 这个类, 然后才能调用
        //这里就是隐式转换.如何转换, 请看反编译
        // todo 我还没搞明白
        mySQL.sayHi()
        println(mySQL.addSuffix("mysql"))

    }

    //一个隐式类, 可以返回一个隐式类的实例，然后就可以调用隐式类的方法
    implicit class DB1(val m: MySQL1) {

        def addSuffix(str:String): String = { //方法
            str + " scala"
        }
        def sayHi(): Unit = {
            println("隐式类的sayHi()")
        }
    }
}

//普通类
class MySQL1 {
    def sayOk(): Unit =    println("自己的sayOk()")
}