package com.welldo.study.chapter7.packageObject4{
  /**
    * 包对象
    * 包可以包含类、对象和特质trait，
    * 但不能包含 函数/方法 或 变量
    * 这是Java虚拟机的局限。
    *
    * 为了弥补这一点不足，scala提供了 包对象 的概念来解决这个问题。
    *
    * 1. 每一个包, 都可以有一个包对象
    * 2. 包对象的名字 需要和包一样
    * 3. 在包对象中定义的变量和方法, 就可以在对应的包中使用
    * (对应的包中的object 和 class中都能使用, class这里就不举例了)
    *
    *
    * 注意, 要使用包对象, 最好写成 第三种打包方式
    ****** 因为: 你需要在父包中定义它。包和包对象是平级关系******
    *
    * @author welldo
    *         2019/12/01
    */
  package  object xx{
    val name = "test"

    def sayHi ()={
      println("hi from package object")
    }
  }

  package xx{
    object TestPkgObj{
      def main(args: Array[String]): Unit = {
        //直接使用包对象的变量
        println(name)

        //使用包对象的方法
        sayHi()
      }
    }

  }
}

