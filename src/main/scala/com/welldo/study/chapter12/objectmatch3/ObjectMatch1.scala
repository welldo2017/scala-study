package com.welldo.study.chapter12.objectmatch3

/**
  * 对象匹配
  *     匹配的规则如下:
  *         case后面, 如果是对象, 则调用此对象的 unapply方法(对象提取器)
  *             此方法 返回Some集合则为匹配成功
  *             此方法 返回None集合则为匹配失败
  * 格式:
  *     x match {
  *         case object(n) => println(n)
  *         case _ => println("nothing matched")
  *     }
  *
  * 流程:
  *     0. 下面把"需要匹配的值" 简称为x, 也就是 x match {...}
  *     1. 执行到 "case 对象" 时, 调用对象的unapply()方法
  *     2. 将x 传入到unapply方法中, 作为参数
  *     3. 此方法如果返回 some(y), 则匹配成功, 同时将some(y) 中的y, 赋值给 object(n)中的n
  *
  * 目的:
  * 看看这个 x , 能被哪个n构建出来.
  *
  * author : welldo 
  * date : 2020/1/11 13:48
  */
object ObjectMatch1 {
    def main(args: Array[String]): Unit = {
        val number: Double = 36.0 //通过Square(6.0) 可以构造出36.0

        number match {
            case Square(n) => println("number 可以被此数构造出来: " +n) // 6.0
            case _ => println("number不能被构造出来")
        }
    }
}

//1. unapply 对象提取器(拆解器)
// 2. apply   对象构建器
// 所以这两个方法 最好互补, 比如: apply进行平方, unapply就进行开平方
object Square {
    //unapply 方法中 自定义接收参数类型, 返回option[T] (泛型自定义)
    // 此方法中根据需要, 自定义逻辑
    // 比如if else, 如果怎样就返回Some , 如果又怎样就返回 None (只能返回这两种)
    def unapply(z: Double): Option[Double] = {
        println("unapply 被调用, 传入参数为: " + z)

        val d = math.sqrt(z) // 此方法返回double
        println("开平方后: "+d)
        Some(d)
    }

    def apply(z: Double): Double = z * z
}
