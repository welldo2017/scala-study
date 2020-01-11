package com.welldo.study.chapter12.match2

/**
  * 元祖的匹配
  *
  * author : welldo 
  * date : 2020/1/11 13:03
  */
object TupleMatch3 {
    def main(args: Array[String]): Unit = {
        //元祖的数组
        val tuples = Array(
            (0, 1),(34,89,66), (1, 0), (6, 7),(1,0,2)
        )

        for (tuple <- tuples) {
            val result = tuple match {
                case (0, _) => "以0开头的二元组"
                case (x, 0) => "以0结尾的二元组"
                case (x, y, z) => "3元祖"
                case _ => "其他元祖"
            }
            println(result)
        }



    }

}
