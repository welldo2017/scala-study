package com.welldo.study.chapter13.partial0

/**
  * 偏函数
  *
  * 需求:
  * 集合val list = List(1, 2, 3, 4, "abc")
  * 将集合list中的所有数字+1，并返回一个新的集合
  * 要求忽略掉 非数字 的元素，即返回的 新的集合 形式为 (2, 3, 4, 5)
  *
  * 2. 再使用稍微先进的方式. 使用模式匹配
  *
  * author : welldo 
  * date : 2020/1/14 16:55
  */
object Demo2 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, "abc")
        val result: List[AnyVal] = list.map(add1)

        //List[AnyVal]类型, List(2, 3, 4, 5, ()), 不是我们想要的结果
        println(result)
    }

    //模式匹配
    def add1(item :Any)={
        item match {
            case x:Int => x +1
            case _ =>
        }
    }
}
