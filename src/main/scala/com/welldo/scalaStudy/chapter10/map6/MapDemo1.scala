package com.welldo.scalaStudy.chapter10.map6
import scala.collection.mutable
/**
  * Map
  * 1. Scala中，有可变Map (scala.collection.mutable.Map) 和 不可变Map(scala.collection.immutable.Map)
  *
  * 2. 不可变的Map是有序的，可变的Map是无序的。
  *     有序: 从输出的结果看到，输出顺序和声明顺序一致
  *
  * 3. 默认情况下（即没有引入其它包的情况下）,Map是不可变的
  * 4. Map中的元素是Tuple2 类型
  *
  * 5. 取值的3种方法
  *     1)如果key存在，则返回对应的值
  *     2)如果key不存在，则抛出异常[java.util.NoSuchElementException]
  *     3)在Java中,如果key不存在则返回null
  *
  * author: welldo
  * date: 2019/12/14 16:39
  */
object MapDemo1 {
    def main(args: Array[String]): Unit = {
        //1. 创建方式1
        val map1 = Map("Alice" -> 10, "Bob" -> 20, "welldo" -> "27岁")
        println(map1)

        //1. 创建方式2,使用元祖
        val map2 = Map(("Alice",10), ("Bob", 20), ("welldo" , "27岁"))
        println(map2)

        //2. 可变集合
        import scala.collection.mutable.{Map => mutableMap} //配置别名
        val map3 = mutableMap("a" -> 10, "b" -> 20, "c" -> 30)
        println(map3)

        //3. 创建空的映射 todo 为什么不能创建 空的Map, 只能空的HashMap
        val map = new mutable.HashMap[String,String]
        println(map)

        //4.1 取值, 如果key不存在, 会抛出异常, 所以应该先用 contains 方法检查是否存在key
        println(map3("a"))
        //println(map3("aa"))
        if (map3.contains("aa")) {
            println("aa存在:" + map3("aa"))
        }else{
            println("aa不存在")
        }

        //4.2 上面的方法, 依然很麻烦
        //通过 map.get(key) ,返回一个Option对象，
        // 要么是Some(代表key存在,), 然后map.get(key).get取出值
        // 要么是None(代表key不存在)
        val option = map3.get("aa")
        println(option)//none
        val option2 = map3.get("a")
        println(option2)
        println(option2.get)//some

        //4.3 上面的方法, 依然很麻烦
        //getOrElse 方法 : def getOrElse[V1 >: V](key: K, default: => V1)
        //如果key存在，返回key对应的值。        如果key不存在，返回默认值。
        println(map3.getOrElse("aa", "this key is not exist"))

    }
}
