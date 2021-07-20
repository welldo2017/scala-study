package com.welldo.study.chapter7.visit5

/**
  * 包的引入的注意事项和细节
  * 1)在Scala中，import语句可以出现在任何地方，并不仅限于文件顶部，
  * import语句的作用范围为 它所在的{}中, 不做演示
  *
  * 2)java中如果想要导入包中所有的类，可以通过通配符*，Scala中采用下划线 _
  *
  * 3)如果不想要某个包中全部的类，而是其中的几个类，可以采用选取器,使用{} 括起来即可。(案例演示)
  *
  * 4)如果引入的多个包中含有相同的类，那么可以将类进行重命名进行区分，这个就是重命名。(案例演示)
  *
  * 5)如果某个冲突的类根本就不会用到，那么这个类可以直接隐藏掉(案例演示)
  *
  * @author welldo
  *         2019/12/2
  */
object import2 {

  def main(args: Array[String]): Unit = {
    //2.
    import scala.collection.mutable._

    //3. 选择器
    import scala.collection.mutable.{ HashSet}

    //4. 重命名
    import java.util.{ HashMap=>JavaHashMap}
    var map = new HashMap() // 此时的HashMap指向的是scala中的HashMap
    var map1 = new JavaHashMap(); // 此时使用的java中hashMap的别名
  }

  def test(): Unit = {
    // 含义为 引入java.util包的所有类，但是忽略 HahsMap类.
    import java.util.{ HashMap=>_, _}

    // 此时的HashMap指向的是scala中的HashMap, 而且idea工具，的提示也不会显示java.util的HashMaple
    import scala.collection.mutable.HashMap
    var map = new HashMap()

  }

}
