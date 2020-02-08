package com.welldo.study.chapter13.curry6

/**
  * 函数柯里化(curry)
  *
  * 例子2
  * 比较两个字符串,是否相等,忽略大小写. 这是两个任务
  * 任务1.全部转成大写或者小写
  * 任务2.比较
  *
  * author : welldo 
  * date : 2020/1/17 17:23
  */
object Demo2 {
    def main(args: Array[String]): Unit = {
        val s1: String = "hello"
        val s2: String = "HELLO"

        val bool = s1.eq(s2)
        println(bool)
    }

    //任务2. 接收两个字符串,比较是否相等.
    def stringIsEq(s1: String, s2: String): Boolean = {
        s1.equals(s2)
    }


    //隐式类, 给String扩展方法
    implicit class TestStringIsEq(s1: String) {
        //任务1.
        def eq(s2: String)(f: (String, String) => Boolean): Boolean = {
            f(s1.toLowerCase(), s2.toLowerCase())
        }
    }


}
