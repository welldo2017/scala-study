package com.welldo.study.chapter15.demo1

import akka.actor.Actor

/**
  * actor 入门案例1: 自我通讯
  * 1. 继承Actor
  * 2. 实现receive() 方法
  *
  * author : welldo
  * date : 2020-02-15 14:46
  */
class FirstActor extends Actor{

    /**
      * 当该Actor 的 MailBox 接收到消息时. 就会调用 该Actor 的 Receive() 方法
      * MailBox实现了 runnable 接口. (runnable这条线程会一直执行)
      *
      * case 后面是: 可能接收到的消息内容, => 后的函数体表示:接到此消息时,执行的操作
      *
      * @return 返回值是 type Receive = PartialFunction[Any, Unit]. 即使一个偏函数
      */
    override def receive: Receive = {
        // todo 偏函数需要复习
        case "1" => println("收到了1")
        case "2" => println("收到了2")

        case "exit" => {
            println("收到exit命令,系统退出")
            //停止FirstActor(自带的邮箱也相应停止)
            context.stop(self)

            //停止ActorSystem
            context.system.terminate()
        }
        case _ => println("收到了其他消息")
    }
}
