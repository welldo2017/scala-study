package com.welldo.scalaStudy.chapter8.static1

/**
  * 1. 在同一个文件中, 有同名的class 和object,那么他俩就是半生关系(也就是说, 伴生类和伴生对象一一对应)
  * 2. class ScalaPerson 是伴生类, 将非静态的内容,定义在该类
  *         编译后, 底层是ScalaPerson.class
  * 3. object ScalaPerson 是伴生对象, 将静态的内容,定义在该对象中
  *         编译后, 底层是ScalaPerson$.class
  * 4. 对于半生对象的属性/方法, 可以直接通过对象名来调用
  *         调用时,在底层,是直接调用半生对象, 暂时没有和半生类发生关联
  *
  * author: welldo
  * date: 2019/12/8 15:20
  */
object Demo2 {
    def main(args: Array[String]): Unit = {
        //4,在底层,等价于 ScalaPerson$.MODULE$.name()
        println(ScalaPerson.name)

        //4,在底层,等价于 ScalaPerson$.MODULE$.showName()
        ScalaPerson.showName()
    }
}

class ScalaPerson {}

/**
  * 反编译后,我们可以看出,  * showName() 这个方法被编译在 ScalaPerson.class中
  * 方法体为:
  * public static void showName(){
  *     ScalaPerson$.MODULE$.showName()
  * }
  *
  * MODULE$ 是ScalaPerson$的一个静态实例
  */
object ScalaPerson {
    var name:String ="zhang3"

    def showName ()={
        println(name)
    }
}


