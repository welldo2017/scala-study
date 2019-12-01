package com.welldo.scalaStudy.chapter7 {

  /**
    * 打包方式一共3种
    * 第三种方式, 引入大括号 {}
    * 1. 在scala中一个文件可以同时创建多个包
    * 2. 在scala中一个文件可以在不同的包下，创建多个class,object,trait
    *
    * @author welldo
    *         2019/12/01
    */
  package packageMode3 {

    //2. 在scala中一个文件可以在不同的包下，创建多个class,object,trait
    object Demo3 {    }
    class User {    }
    trait UserT {   }
  }

  //3)作用域原则：可以直接向上访问。
  // 即: Scala中子包中直接访问父包中的内容, 大括号体现作用域。
  // (提示：Java中子包使用父包的类，需要import)。
  // 在子包和父包 类重名时，默认采用就近原则，
  // 向上访问时, 如果希望指定使用某个类，则带上包名即可。

  //  向下访问时,即父包要访问子包的内容时，需要import对应的类等, 这里不举例
  class Person {}

  //1. 在scala中一个文件可以同时创建多个包
  package packageMode4 {

    class Person {}

    //测试作用域
    object TestZuoYongYu {
      def main(args: Array[String]): Unit = {
        val person = new Person
        //手动指定
        val ParentPerson = new com.welldo.scalaStudy.chapter7.Person
      }
    }

  }

  package packageMode5 {  }

}
