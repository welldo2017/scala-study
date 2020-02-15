package com.welldo.study.chapter15.demo2

import akka.actor.{ActorRef, ActorSystem, Props}

/**
  * 调用: 每人拍10下后,退出系统
  *
  * author : welldo
  * date : 2020-02-15 15:55
  */
object TestApp extends  App {
    //1. 创建actorSystem
    private val factory = ActorSystem("factory")

    //2.先创建actor2 的引用
    private val actor2Ref: ActorRef = factory.actorOf(Props[Actor2],"actor2")

    //3. 创建actor1 的引用
    private val actor1Ref: ActorRef = factory.actorOf(Props(new Actor1(actor2Ref)),"actor1")

    //4. 给actor1 发消息
    actor1Ref ! "游戏开始"
}
