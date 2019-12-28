package com.welldo.study.chapter10.list5

/**
  * Scala中的List 和Java List 不一样，在Java中List是一个接口，真正存放数据是实现类,比如ArrayList，
  * 而Scala的List可以直接存放数据，
  * List属于序列Seq, 是不可变的,(如果想使用可变的, 请使用ListBuffer)
  *
  * 思考题: 为什么不引人包也能使用List?
  *     原因： 因为有包对象:package object scala , 包中声明了(第57行)
  *     val List = scala.collection.immutable.List
  *     val Nil = scala.collection.immutable.Nil
  *
  *     (chapter7.packageObject4中介绍了包对象)
  *     (chapter7.packageName2中 说明了, scala包不需要显式导入. )
  *
  * author: welldo
  * date: 2019/12/13 16:52
  */
object ListDemo1 {
    def main(args: Array[String]): Unit = {
        //1. 创建(加泛型, 和不加泛型)
        val list01 = List(1, 2, 3) //创建时，直接分配元素  apply
        println(list01)

        val intList = List[Int](10,20,30)
        println(intList)

        val anyList = List[Any](10,20,"jack")
        println(anyList)
        println("==================")

        //3. 访问, 使用小括号和索引, 索引从0开始
        val value = anyList(2)
        println(value)
        println("==================")


        //2. 创建空集合方式1
        val nullList = List()
        println(nullList)

        //2. 创建空集合方式2 (null immutable list)
        val nullList2 = Nil
        println(nullList2)
    }
}
