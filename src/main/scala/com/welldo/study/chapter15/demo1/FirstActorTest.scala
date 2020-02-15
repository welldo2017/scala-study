package com.welldo.study.chapter15.demo1

import akka.actor.{ActorRef, ActorSystem, Props}

/**
  * test
  *
  * author : welldo
  * date : 2020-02-15 14:54
  */
object FirstActorTest {

    //1. 先创建 ActorSystem, ( ActorSystem用于创建Actor )
    private val actorFactory = ActorSystem("actorFactory")

    /**
      * 2. 创建一个actor的同时,返回该actor的ref
      * 参数1: Props[FirstActor]使用反射的方式,创建 FirstActor 实例
      * 参数2: 给该actor取名
      * 返回值ActorRef: 就是该actor的引用
      *
      * FirstActor 实例 被ActorSystem接管.
      */
    private val fistActorRef: ActorRef = actorFactory.actorOf(Props[FirstActor],"fistActor")


    def main(args: Array[String]): Unit = {
        //3. 发消息
        // 给 fistActorRef 发消息.使用叹号, 后面是要发送的 消息内容
        // 消息被 dispatcher message收到后, 发给对应的Actor(也就是FirstActor)的邮箱.
        fistActorRef ! "1"
        fistActorRef ! "2"
        fistActorRef ! "3"

        //没有下面的 退出 ActorSystem 代码, mian方法会一直执行
        //runnable这条线程(也就是mailBox线程)会一直执行
        fistActorRef ! "exit"
    }

}
