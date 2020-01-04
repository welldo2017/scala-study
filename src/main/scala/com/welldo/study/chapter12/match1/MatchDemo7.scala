package com.welldo.study.chapter12.match1

/**
  * 类型匹配
  *     可以匹配对象的任意类型，这样做避免了使用isInstanceOf和asInstanceOf方法
  *
  * author: welldo
  * date: 2020/1/4 18:41
  */
object MatchDemo7 {
    def main(args: Array[String]): Unit = {

        val a = 3

        val obj = if(a == 1) 1      //1
        else if(a == 2) "2"                //啥也不是
        else if(a == 3) BigInt(3)           //
        else if(a == 4) Map("aa" -> 1)
        else if(a == 5) Map(1 -> "aa")
        else if(a == 6) Array(1, 2, 3)
        else if(a == 7) Array("aa", 1) //Array[Any],啥也不是
        else if(a == 8) Array("aa","bb")


        // 这里用到了MatchDemo5 模式中的中变量
        val result = obj match {
            case _ : BigInt => {
                println("_")
                Int.MaxValue //这里只要是BigInt 就行, 表示忽略匹配的变量值, 这里不是默认匹配
            }
            case a : Int => a
            case b : Map[String, Int] => "字符串-数字 Map"
            case c : Map[Int, String] => "数字-字符串 Map"
            case d : Array[String] => {
                println(d.mkString(","))
                "字符串数组"
            }
            case e : Array[Int] => "数字数组"
            case f : BigInt => {
                println(f)
                Int.MaxValue
            }
            case _ => "啥也不是"
        }
        println(result)
    }

}
