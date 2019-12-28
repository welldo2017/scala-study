package com.welldo.study.chapter5.functionDetail2

/**
  * 2)形参列表和返回值列表的数据类型可以是值类型和引用类型。【案例演示】
  * @author welldo
  *         2019/11/21
  */
object Detail2 {

  def main(args: Array[String]): Unit = {
    val tiger = new Tiger

    //形参列表的数据类型可以是 值类型 和 引用类型。
    val t = test1(10,tiger)
    println(t.name)


  }

  //形参列表的数据类型可以是 值类型 和 引用类型。
//  返回值的数据类型可以是值类型和引用类型。(值类型就不演示了)
  def test1(age: Int, tiger: Tiger):Tiger={
    tiger.name = "jack"
    tiger
  }



}

class Tiger {
  var name :String = ""
}