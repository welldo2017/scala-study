package com.welldo.study.chapter10.list5

/**
  * List-元素的追加
  * 向列表中增加元素, 会返回新的列表/集合对象。(因为List不可变, 只能返回新的对象)
  *
  * 1. 在列表的最后增加数据
  *     :+ 在列表的最后增加数据, 靠近:的是集合, 靠近+的是元素 --> 集合:+元素
  *
  * 2. 在列表的最前面增加数据
  *     +: 在列表的前面增加数据, 靠近:的是集合, 靠近+的是元素 --> 元素+:集合
  *
  * 3. 往列表中增加多个数据
  *     ::  符号前面为 元素or集合,符号后面必须是集合(人可以进入箱子, 箱子不能进入人) -->  元素or集合 :: 集合
  *     注意, 当 A集合::B集合 时, A集合看成一个整体(一个元素)进入到B集合中, 好比小箱子放入到大箱子中
  *
  * 4. 往列表中增加一个列表
  *     ::: 符号前后都为 集合, --> 集合A:::集合b
  *     注意, 当 A集合:::B集合 时, 将集合A中的元素, 一个一个拿出来, 放入到集合B中,而不是小箱子放入到大箱子中
  *
  * tips: eg3 和eg4 如何理解?
  *     eg3中, 1::2::3::list3::list1
  *     从右往左运算,
  *     step1-  list3::list1, 得到List(List(A, B, C), a, b, c) 把这个看成一个整体x
  *     step2-  3::x, 得到 List(3,List(A, B, C), a, b, c) 把这个看成一个整体y
  *     step3-  2::y, 得到 List(2,3,List(A, B, C), a, b, c) 把这个看成一个整体z
  *     step4-  1::z, 得到 List(1,2,3,List(A, B, C), a, b, c)
  *     如何记忆: 添加时, 元素排列的顺序, 就是新对象中的顺序
  *
  * author: welldo
  * date: 2019/12/13 17:27
  */
object ListDemo2 {
    def main(args: Array[String]): Unit = {

        //1
        println("=========1=========")
        val list1 = List[Any]("a","b","c")
        val listAdd = list1 :+ "后面"
        //list1 没有变化, 印证了List不可变
        println(list1)
        println(listAdd)

        //2.
        println("=========2=========")
        val addList = "前面" +:list1
        println(addList)

        //3.
        println("=========3=========")
        val list3 = List[Any]("A","B","C")
        val listAddMany = 1::2::3::list3::list1
        //元素排列的顺序, 就是新对象中的顺序
        println(listAddMany)

        //4
        println("=========4=========")
        val list4 = List[Any]("AA","BB","CC")
        val listAddList = 4::5::6::list4:::list1
        //元素排列的顺序, 就是新对象中的顺序
        println(listAddList)
    }
}
