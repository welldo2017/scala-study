package com.welldo.study.chapter9.ImplicitValueExercise2

/**
  * 隐式值 的练习
  * 1. 和 demo1.ImplicitDemo2 例子一致
  * 隐式值与变量名无关(就是说变量名随意)，只与变量的类型有关。
  * 也就是说, 同一类型的隐式值, 只能有一个. 有多个就会报错.
  *
  * 2. 没有传入实参, 则编译器会自动的将 隐式值 关联到 隐式参数 上
  *  就是说, 优先级:  实参>隐式参数>默认参数
  *
  * author: welldo 
  * date: 2020/1/1 12:34
  */
object ExerciseDemo1 {

    def main(args: Array[String]): Unit = {
        //必须注释一个, 否则报错
        implicit val name1 :String = "world"
        //implicit val name2 :String = "scala"

        hello1
    }

    //2.
    //输出hello world, 为什么不是hello Jack?
    //从 demo1.ImplicitValue4 得知
    //没有传入实参, 则编译器会自动的将 隐式值 关联到 隐式参数 上
    def hello1(implicit name:String = "jack")={
        println("hello,"+ name )
    }

}
