package com.welldo.scalaStudy.chapter5.functionDetail2

/**
  * 13. Scala函数支持可变参数
  * 注意可变参数只能放在最后
  * 使用方法: 在括号中写上 args: Int*
  * Int也可以替换为其他泛型
  *
  * 支持0到多个参数
  * 支持1到多个参数
  * ......
  *
  * author: welldo
  * date: 2019/11/23
  */
object Detail13 {

  def main(args: Array[String]): Unit = {
    sum()
    sum(10, 20, 30, 40)
  }

  //支持0到多个参数
  def sum (args: Int*)={
    println("参数个数为: "+args.length)

    var res = 0
    for (elem <- args) {
      res += elem
    }
    println("求和结果为: "+res)
  }


}
