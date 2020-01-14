package com.welldo.study.chapter13.partial0

/**
  * 偏函数
  * (偏函数是一个特质: PartialFunction)
  *
  * 需求:
  *   集合val list = List(1, 2, 3, 4, "abc")
  *   将集合list中的所有数字+1，并返回一个新的集合
  *   要求忽略掉 非数字 的元素，即返回的 新的集合 形式为 (2, 3, 4, 5)
  *
  * 3. 使用偏函数解决
  * 使用场景:
  *   不是针对所有元素都进行逻辑操作，而只针对符合条件的元素进行操作, 此时,使用偏函数是一个不错的选择
  *
  * author : welldo 
  * date : 2020/1/14 18:07
  */
object Demo3 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "abc")

    //创建一个偏函数
    val pf = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = {
        println("isDefinedAt被调用")
        x.isInstanceOf[Int]
      }

      override def apply(v1: Any): Int = {
        println("apply 被调用\n")
        v1.asInstanceOf[Int] + 1
      }
    }

    val list2 = list.collect(pf)
    println(list2)
  }

  //总结
  //1)使用构建特质的实现类(使用的方式是PartialFunction的匿名子类)

  //2)PartialFunction 是个特质(看源码)

  //3)构建偏函数时，参数形式 自定义, 例子中[Any, Int]是泛型，第一个表示传入参数类型，第二个表示返回参数

  //4)当使用偏函数时，会遍历集合的所有元素， 然后对每个元素先执行isDefinedAt()方法,
  //    如果返回值为true ,则继续对此元素执行 apply, 构建返回值
  //    如果返回值为false 就过滤掉这个元素，即不构建新的Int对象.

  //6)map函数不支持偏函数，因为map底层的机制是遍历所有元素，无法过滤处理元素
  //7)collect函数支持偏函数
}
