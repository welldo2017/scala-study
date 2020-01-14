package com.welldo.study.chapter12.cassclass6

/**
  * author : welldo 
  * date : 2020/1/14 14:56
  */
object DiscountSale2 {
    def main(args: Array[String]): Unit = {
        //这一捆Bundle中有两样东西, 即两个Item
        //第一样东西(描述: 书籍, 共减免10元, 商品是一本书)
        //第二样东西, 又是一捆Bundle(描述: 文学作品, 共减免20元, 商品是2本书)
        //最终价格: (40 – 10) + ((80+30)-20) = 120
        val sale = Bundle(
            "书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30))
        )
        println(price(sale))//120.0


        val sale2 = Bundle(  "书籍", 10, Book("漫画", 40)  )
        println(price(sale2))//一捆里只有一本. 30.0


        val sale3 = Book("阳关",80.0)
        println(price(sale3))//单独一本, 无减免
    }

    /**
      * 递归执行
      * item 要么是 Book, 要么是 Bundle
      * 遇见bundle, 不清楚这捆bundle中有多少个item,所以递归执行
      */
    def price(item: Item): Double = {
        item match {
            case Book(_, p) => p
            case Bundle(_, discount, its@_*) => its.map(price).sum - discount //110 - 20 = 90
        }
    }

}
