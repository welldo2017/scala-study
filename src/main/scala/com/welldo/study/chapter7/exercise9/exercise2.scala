package com.welldo.study.chapter7.exercise9

import scala.beans.BeanProperty

/**
  * 练习2
  * 抽象类 Circle  * 实现类 Cylinder
  * 在测试类中, 创建Cylinder类的对象, 设置圆柱的底面半径 和高, 输出圆柱的体积
  *
  * author: welldo
  * date: 2019/12/8 13:23
  */
object exercise2 {
    def main(args: Array[String]): Unit = {
        val cylinder = new Cylinder
        cylinder.setHigh(1.0)
        cylinder.setRadius(1.0)

        println(cylinder.findArea())
    }
}

abstract class Circle(r:Int = 1){
   @BeanProperty var radius :Double = r

    def findArea():Double
}

class Cylinder extends Circle {
    @BeanProperty var high :Double =_

    override def findArea():Double = {
        val area = Math.PI * radius *radius
        area
    }
}




