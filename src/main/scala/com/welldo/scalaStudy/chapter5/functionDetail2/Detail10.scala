package com.welldo.scalaStudy.chapter5.functionDetail2

/**
  * 10. 如果存在多个参数，每一个参数都可以设定默认值，
  * 那么这个时候，传递的参数到底是覆盖默认值，还是赋值给没有默认值的参数?
  * 答案: 从左到右依次覆盖
  *
  * 如果想指定覆盖某个值,可以采用带名参数
  *
  * 11. scala 函数的形参默认是val的，因此不能在函数中进行修改.
  *
  * @author welldo
  *         2019/11/23
  */
object Detail10 {

  def main(args: Array[String]): Unit = {

    //使用默认值
    getMySQLConn()
    println("===========================")

    //从左到右依次覆盖,
    getMySQLConn("127.0.0.1",3306)
    println("===========================")

    //只想更改用户名和密码, 则使用带名参数
    getMySQLConn(user = "welldo",pwd = "welldo")

  }

  def getMySQLConn(add: String = "localhost", port: Int = 3306,
               user: String = "root", pwd: String = "root"): Unit = {
    println("add=" + add)
    println("port=" + port)
    println("user=" + user)
    println("pwd=" + pwd)
  }


  /**
    * 练习题:
    * test(2), 输出什么?
    *   直接报错, 因为参数是从左到右覆盖, 所以2赋值给p1;
    *   但p2没有默认值,所以需要传入参数
    *
    * test(p2=2),输出什么?
    *   就是普通的带名参数
    */
  def test(p1:Int = 1, p2:Int): Unit ={
    println(p1 + "---" +p2)

    //scala 函数的形参默认是val的，因此不能在函数中进行修改.
    //p1 =10

  }

}