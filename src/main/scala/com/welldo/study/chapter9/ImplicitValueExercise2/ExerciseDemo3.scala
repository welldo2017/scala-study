package com.welldo.study.chapter9.ImplicitValueExercise2

/**
  * 隐式值 的练习
  * 隐式值类型不匹配时, 就使用默认值
  *
  * author: welldo 
  * date: 2020/1/1 12:34
  */
object ExerciseDemo3 {

    def main(args: Array[String]): Unit = {
        implicit val name1 :Int = 10

        hello3
    }

    def hello3(implicit name:String = "jack")={
        println("hello,"+ name )
    }

}
