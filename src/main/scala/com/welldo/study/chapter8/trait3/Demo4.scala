package com.welldo.study.chapter8.trait3

/**
  * 特质的底层分析1
  * 当特质里只有抽象方法时, 反编译可以看到, 特质被编译为接口
  *
  * author welldo
  * date 2019/12/10
  */
object Demo4 {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep4
    sheep.sayHi()
  }

}

// 反编译后看到, 底层是 public abstruct interface Trait4,
// 这里面的抽象方法, 就对应 接口里的抽象方法
trait Trait4{
  //只有抽象方法
  def sayHi()
}

// 底层: 这个类 实现了上面的接口
class Sheep4 extends  Trait4{
  override def sayHi(): Unit = {
    println("小羊4 sayHi")

  }
}


