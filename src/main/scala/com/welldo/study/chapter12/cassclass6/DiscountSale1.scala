package com.welldo.study.chapter12.cassclass6

/**
  * 商品减免的相关知识点
  *
  * author : welldo 
  * date : 2020/1/13 11:24
  */
object DiscountSale1 {
    def main(args: Array[String]): Unit = {

        //这一捆Bundle中有两样东西, 即两个Item
        //第一样东西(描述: 书籍, 共减免10元, 商品是一本书)
        //第二样东西, 又是一捆Bundle(描述: 文学作品, 共减免20元, 商品是2本书)
        //最终价格: (40 – 10) + ((80+30)-20) = 120
        val sale = Bundle(
            "书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30))
        )


        //知识点1: 如何取出 第一捆中的book的name
        // _* 代表其余的 Item
        val bookName = sale match {
            case Bundle(_, _, Book(name, _), _*) => name
        }
        println(bookName)

        val bookPrice = sale match {
            case Bundle(_, _, Book(_, price), _*) => price
        }
        println(bookPrice)


        println("知识点2==============================")
        //知识点2: 如何将整个对象, 交给一个变量?
        // 通过 @变量名 将嵌套的值绑定到变量。_* 绑定剩余Item到rest
        //返回一个元祖(marvel, rest),
        // (因为不清楚 rest代表多少个Item,所以返回 WrappedArray , 里面有1个或者多个 Item)
        val result: (Book, Seq[Item]) = sale match {
            case Bundle(_, _, marvel@Book(_, _), rest@_*) => (marvel, rest)
        }
        println(result._1)
        println(result._2)


        println("知识点3==============================")
        //知识点3: 不使用_*绑定剩余Item到rest
        //当你明确知道 rest只代表一个 Item的时候, 可以省略 _*
        val result3: (Book, Item) = sale match {
            case Bundle(_, _, marvel@Book(_, _), rest) => (marvel, rest)
        }
        println(result3._1)
        println(result3._2)
    }
}
