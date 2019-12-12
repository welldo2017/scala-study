package com.welldo.scalaStudy.chapter10.arrayToJavaList3

import java.util
import scala.collection.mutable
/**
  * scala集合与java集合之间的相互转换
  *
  * java的List 转scala 的arrayBuffer
  *
  * @author welldo
  * date 2019/12/12
  */
object Demo2 {
  def main(args: Array[String]): Unit = {

    val javaList:util.List[String] = new util.ArrayList[String]()
    javaList.add("zhang3")
    javaList.add("li4")

    //隐式转换
    import scala.collection.JavaConversions.asScalaBuffer

    // java.util.List ==> Buffer
    val scalaArr: mutable.Buffer[String] = javaList
    scalaArr.append("jack")
    println(scalaArr)
  }
}
