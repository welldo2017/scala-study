package com.welldo.study.chapter8.mixin5

/**
  * 在特质中重写抽象方法 的特例 (和动态混入配合使用)
  *
  * author welldo
  * date 2019/12/24
  */
object MixInDemo3 {
  def main(args: Array[String]): Unit = {
    val mySQL = new MySQL3 with  DB3 with File3
    mySQL.insert(666)
  }
}
class MySQL3 {}



trait Operate3 {
  def insert(id: Int)
}

trait File3 extends Operate3 {
  //特例
  // 重写了父特质的方法，同时调用了父特质的抽象方法, 执行时会报错.
  //  def insert(id: Int): Unit = {
  //    println("将数据保存到文件中..")
  //    super.insert(id)
  //  }

  //解决办法
  //(1)abstract  override 表示告诉编译器，该方法重写，但是仍然是抽象,
  // 2.这里的super.insert()不是执行父特质，而是在动态混入时，指向前面的某个特质的super.insert
  //所以. 我们在混入 File5 要注意混入的顺序。
  abstract  override def insert(id: Int): Unit = {
    println("保存到file中..")
    super.insert(id)
  }
}


trait DB3 extends Operate3 {
  def insert(id: Int): Unit = {
    println("存到db中.." + id)
  }
}