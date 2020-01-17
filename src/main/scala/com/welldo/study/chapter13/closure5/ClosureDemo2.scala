package com.welldo.study.chapter13.closure5

/**
  * 闭包: closure
  *
  * 编写一个函数 makeSuffix(suffix: String)  可以接收一个文件后缀名(比如.jpg)，并返回一个闭包
  * 调用闭包时，传入一个文件名，如果该文件名没有指定的后缀(比如.jpg) ,补齐后缀 , 如果已经有.jpg后缀，则原样返回
  *
  * author : welldo 
  * date : 2020/1/17 15:23
  */
object ClosureDemo2 {
    def main(args: Array[String]): Unit = {
        val closureMkSuffix = makeSuffix(".jpg")

        //调用闭包时，传入一个文件名
        val fileName1 = closureMkSuffix("dog")
        val fileName2 = closureMkSuffix("cat.jpg")

        println(fileName1)
        println(fileName2)
    }


    /**
      * 接收一个后缀名, 并返回一个闭包
      */
    def makeSuffix(suffix: String) = {
        (fileName:String) => {
            if (fileName.endsWith(suffix))
                fileName
            else
                fileName + suffix
        }
    }
}
