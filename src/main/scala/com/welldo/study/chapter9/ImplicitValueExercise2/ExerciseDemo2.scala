package com.welldo.study.chapter9.ImplicitValueExercise2

/**
  * 隐式值 的练习
  *
  * 2. 没有传入实参, 则编译器会自动的将 隐式值 关联到 隐式参数 上
  *  就是说, 优先级:  实参>隐式参数>默认参数
  *
  * author: welldo 
  * date: 2020/1/1 12:34
  */
object ExerciseDemo2 {

    def main(args: Array[String]): Unit = {
        implicit val name1 :String = "world"

        hello2
    }

    //2.
    //输出hello world, 为什么不是hello Jack?
    //从 demo1.ImplicitValue4 得知
    //没有传入实参, 则编译器会自动的将 隐式值 关联到 隐式参数 上
    def hello2(implicit name:String = "jack")={
        println("hello,"+ name )
    }

}
