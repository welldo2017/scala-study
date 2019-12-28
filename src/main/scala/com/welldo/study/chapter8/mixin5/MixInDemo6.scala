package com.welldo.study.chapter8.mixin5

/**
  * 特质也是有构造器的，构造器中的内容由“字段的初始化”和一些其他语句构成。具体实现请参考“特质叠加”
  *
  * 第一种特质构造顺序(声明类的同时混入特质, 相当于静态混入)
  *   1)调用当前类的超类构造器
  *   2)第一个特质的父特质构造器
  *   3)第一个特质构造器
  *   4)第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
  *   5)第二个特质构造器
  *   6).......重复4,5的步骤(如果有第3个，第4个特质)
  *   7)当前类构造器   [案例演示]
  *
  * 第2种特质构造顺序(在构建对象时，动态混入特质)
  *     1)调用当前类的超类构造
  *     2)当前类构造
  *     3)第一个特质构造器的父特质构造器
  *     4)第一个特质构造器.
  *     5)第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
  *     6)第二个特质构造器
  *     7)......重复5,6的步骤(如果有第3个，第4个特质)
  *     8)当前类构造器   [案例演示]
  *
  * 分析两种方式对构造顺序的影响
  *   第1种方式实际是构建类对象, 在混入特质时，该对象还没有创建。
  *   第2种方式实际是构造匿名子类，可以理解成在混入特质时，对象已经创建了
  * author welldo
  * date 2019/12/25
  */
object MixInDemo6 {
  def main(args: Array[String]): Unit = {

    //第一种特质构造顺序(声明类的同时混入特质)
    //1.E...    //2. A...    //3. B....    // 4. C....    // 5. D....    // 6. F....
    val ff = new FF

    println("***************")

    //1. E...    //2. K....    //3. A    //4. B    //5. C    //6. D
    val ff2 = new KK with CC with DD
  }
}

trait AA {
  println("A...")
}

trait BB extends AA {
  println("B....")
}

trait CC extends BB {
  println("C....")
}

trait DD extends BB {
  println("D....")
}


class EE {
  println("E...")
}

//相当于静态混入
class FF extends EE with CC with DD {
  println("F....")
}

class KK extends EE {
  println("K....")
}