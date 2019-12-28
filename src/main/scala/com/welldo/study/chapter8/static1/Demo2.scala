package com.welldo.study.chapter8.static1

/**
  * 1. 在同一个文件中, 有同名的class 和object,那么他俩就是半生关系(也就是说, 伴生类和伴生对象一一对应)
  * 2. class ScalaPerson 是伴生类, 将非静态的内容,定义在该类
  *         编译后, 底层是ScalaPerson.class
  * 3. object ScalaPerson 是伴生对象, 将静态的内容,定义在该对象中
  *         编译后, 底层是ScalaPerson$.class
  * 4. 对于半生对象的属性/方法, 可以直接通过对象名来调用
  *         调用时,在底层,是直接调用半生对象, 暂时没有和半生类发生关联
  *
  * 5. 从底层原理看，伴生对象实现静态特性是依赖于 public static final  MODULE$ 实现的。
  *
  * 6. 图标,会变成一半蓝色, 一半黄色的图标
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
  * 反编译后,我们可以看到, ScalaPerson$中生成的, 仍然是普通的属性和方法,不是static
  * 那到底是如何实现静态的呢?
  * 从底层原理看，伴生对象实现静态特性是依赖于 public static final  MODULE$ 实现的。
  * MODULE$ 是ScalaPerson$的一个静态实例  * 通过这个静态对象来调用 属性和方法.
  *
  * 那么,调用的入口在哪里呢?
  * showName() 方法,在 ScalaPerson.class中会生成 如下:
  *     public static void showName(){
  *         ScalaPerson$.MODULE$.showName()
  *     }
  *
  */
object ScalaPerson {
    var name: String = "zhang3"

    def showName() = {
        println(name)
    }
}


