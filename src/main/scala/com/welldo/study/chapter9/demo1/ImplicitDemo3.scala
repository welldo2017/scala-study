package com.welldo.study.chapter9.demo1

/**
  * 用隐式转换, 给类库 添加功能
  *     在当前程序中，如果想要给MySQL类增加功能是非常简单的，
  *     但是在实际项目中，如果想要增加新的功能就会需要改变源代码，这是很难接受的。
  *     而且违背了软件开发的OCP开发原则 (开闭原则 open close priceple)
  *
  *     在这种情况下，可以通过隐式转换函数给类动态添加功能。
  * 感觉没啥用
  *
  * author: welldo 
  * date: 2019/12/28 14:57
  */
object ImplicitDemo3 {

    //隐式函数
    implicit def addDelete(mySQL: MySQL): DB = {            new DB        }

    def main(args: Array[String]): Unit = {
        //创建MySQL对象
        val mySQL = new MySQL
        mySQL.delete() //底层(编译器做的转换)是这样的: addDelete$1(mySQL).delete()
    }
}

class MySQL {
    def insert(): Unit = {
        println("insert")
    }
}

class DB {
    def delete(): Unit = {
        println("delete...")
    }
}
