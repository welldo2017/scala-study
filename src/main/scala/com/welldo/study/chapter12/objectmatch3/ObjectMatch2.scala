package com.welldo.study.chapter12.objectmatch3

/**
  * 对象匹配 ,
  * 当case 后面的对象提取器方法的参数为多个，则会默认调用def unapplySeq() 方法
  * 如果unapplySeq返回是Some(?,?,?)，获取其中的值,
  *     判断得到的sequence中的元素的个数是否是三个,如果是三个，则把三个元素分别取出，赋值给a，b和c
  * 其它的规则不变.
  *
  * author : welldo 
  * date : 2020/1/11 14:57
  */
object ObjectMatch2 {
    def main(args: Array[String]): Unit = {
        val str = "tom,jack,smith"

        str match {
            case Names(a,b,c) =>   println(s"a=$a b=$b c=$c")
        }
    }
}

object Names {
    //当构建对象需要多个参数时，
    //在进行对象匹配 的时候, 会调用 unapplySeq方法
    //匹配的规则和 unapply 一样, 只是 Some(?,?,?)
    def unapplySeq(str: String): Option[Seq[String]] = {
        if (str.contains(",")) {
            Some(str.split(",")) //Some("tom","jack","smith")
        }else None
    }

}
