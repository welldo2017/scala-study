package com.welldo.scalaStudy.chapter8.mixin5

/**
  * 动态混入(mix in)  * 叠加特质
  *
  * 构建对象的同时如果混入多个特质，称之为叠加特质，
  * 那么特质声明顺序从左到右，方法执行顺序从右到左。
  *
  * @author welldo
  * date 2019/12/11
  */
object MixInDemo2 {
  def main(args: Array[String]): Unit = {

    //当初始化 mysql 这个对象时, 先走file4这条线,依次输出;再走db4这条线,
    //由于 file4时已经走过 爷爷和爸爸了, 所以db4就不再走.
    val mysql = new MySQL4 with File4 with DB4


    //mysql执行方法, 先执行最右边的, 也就是DB4的insert方法,
    //执行DB4的insert方法时, 调用了super.insert(id),
    //这里的super不是真的super( 即Data4), 而是倒数第二右的 trait File4
    //依次类推, 直到 走完所有的叠加特质.
    //再执行 最后走的特质的super, 这里也就是 data4的insert方法
    mysql.insert(100)//    向数据库,    //    向文件,    //    插入数据 = 100
  }
}

//普通的类
class MySQL4 {}



trait Operate4 {
  println("爷爷级特质...")
  def insert(id: Int)
}

trait Data4 extends Operate4 {
  println("父亲级特质...")

  override def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}

trait DB4 extends Data4 {
  println("子特质db...")

  override def insert(id: Int): Unit = {
    println("向数据库,")
    super.insert(id)
  }
}

trait File4 extends Data4 {
  println("子特质File...")

  override def insert(id: Int): Unit = {
    println("向文件,")

    //理论上应该是调用其父特质的insert
    //这里的 super 含义： Scala中特质中如果调用super，并不是表示调用父特质的方法，
    // 而是向前面（左边）继续查找特质，如果找不到，才会去父特质查找
    super.insert(id)


    //如果我们就是希望去让super指向自己的直接父特质，可以如下操作
    super[Data4].insert(id) //这里的Data4必须是File4 直接父特质(运行报错)
  }
}