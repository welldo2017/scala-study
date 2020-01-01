package com.welldo.study.chapter9.ImplicitValueExercise2

/**
  * 隐式值 的练习
  * 没有隐式值, 没有默认值, 又没有传入实参, 则报错
  *
  * author: welldo 
  * date: 2020/1/1 12:34
  */
object ExerciseDemo4 {

    def main(args: Array[String]): Unit = {
        //hello4
    }

    def hello4(implicit name:String )={
        println("hello,"+ name )
    }

}
