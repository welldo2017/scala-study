package com.welldo.study.chapter8.mixin5

/**
  * 动态混入(mix in)
  * 特质中可以定义字段，如果初始化了就是具体字段，如果不初始化就是抽象字段。
  * 混入该特质的类就具有了该字段，字段不是继承，而是直接复制过来，成为自己的字段。
  *
  * @author welldo
  *         date 2019/12/11
  */
object MixInDemo5 {
  def main(args: Array[String]): Unit = {
    //如果特质有抽象字段, 混入该特质时, 需要重写 抽象字段
    val mySQL = new MySQL5 with Operate5 {
      override var opertype: String = "zzz"
    }
    println(mySQL.opertype)

    val sQL = new MySQL5 with Operate51
    println(sQL.opertype)
  }
}

//特质
trait Operate5 {
  var opertype: String //抽象字段
}

trait Operate51 {
  var opertype: String = "insert" //具体字段
}

class MySQL5 {}
