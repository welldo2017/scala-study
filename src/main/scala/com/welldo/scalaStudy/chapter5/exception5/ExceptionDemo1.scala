package com.welldo.scalaStudy.chapter5.exception5

/**
  * java 有编译时异常 和 运行时异常
  * scala中只有运行时异常
  *
  * 设计者认为，如果程序员编程时，认为某段代码可疑，就直接try并处理
  *
  * 0. 如果代码可疑，使用try进行处理
  * 1. 只有一个catch
  * 2. 在catch中，可以有多个case ，每个case匹配一种异常
  * 3. case ex: Exception => println("异常信息=" + ex.getMessage)
  *    (1) case 是一个关键字
  *    (2) ex: Exception  异常的种类
  *    (3) => 表明后的代码是对异常进行处理,如果处理的代码有多条语句可以{}扩起
  *
  * 4. 在scala中把范围小的异常放在后面，语法不会报错，但是不推荐
  * 6. finally是最终要执行的代码
  *
  * author: welldo 
  * date: 2019/11/23 14:58
  */
object ExceptionDemo1 {
  def main(args: Array[String]): Unit = {
    try {
      var res = 10 / 0
    } catch {
      case ex: ArithmeticException => {
        println("具体的异常: " + ex.getMessage)
      }

      case ex: Exception => println("最大的异常: " + ex.getMessage)

    } finally {
      //一般要写释放资源的代码
      println("finally的代码...")
    }

    println("程序继续....")
  }

}
