package com.welldo.study.chapter13.abstract7

/**
  * 抽象控制
  *
  * 控制抽象是这样的函数，满足如下条件
  *     1)参数是函数
  *     2)函数参数没有输入值也没有返回值
  *
  * @author : welldo
  * date : 2020-02-08 17:08
  */
object AbstractControlDemo1 {
    def main(args: Array[String]): Unit = {

        //常规方法调用myRunInThread
        //{} 内是一个函数,没有输出和输入,
        // () => 没有必要写,但是不能省略. 那么,如何才能省略呢?
        myRunInThread {
            () =>
                println("常规启动")
                Thread.sleep(1000)
                println("结束！")
        }

        Thread.sleep(4000)

        //省略版本
        myRunInThread2 {
            println("抽象控制方式启动")
            Thread.sleep(1000)
            println("结束！")
        }
    }

    // 此方法就是一个抽象控制
    //参数是函数, 此f1 函数, 没有输入值，没有返回值
    def myRunInThread(f1: () => Unit): Unit = {
        new Thread {
            override def run(): Unit = {
                f1() //调用了f1
            }
        }.start()
    }


    //对 myRunInThread 方法的改进
    //省略 f1的 ()
    def myRunInThread2(f1: => Unit): Unit = {
        new Thread {
            override def run(): Unit = {
                f1 //调用了f1
            }
        }.start()
    }


}
