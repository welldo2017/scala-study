package com.welldo.study.chapter15.demo3

import akka.actor.{ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

/**
  * actor 入门案例3:
  *     相互通信, 经过tcp socket网络传输.
  *     一个工商银行的客户,
  *     去咨询一个工商银行的工作人员.
  *
  * author : welldo
  * date : 2020-02-15 20:09
  */
object IcbcApp extends App {

    //模板代码,无需记忆.
    val host = "127.0.0.1"
    val port = 9999
    val config = ConfigFactory.parseString(
        s"""
           |akka.actor.provider="akka.remote.RemoteActorRefProvider"
           |akka.remote.netty.tcp.hostname=$host
           |akka.remote.netty.tcp.port=$port
       """.stripMargin)

    //1. 创建actorSystem(因为需要监听网络,所以需要加入config)
    private val factory = ActorSystem("factory",config)

    //2. 创建工作人员
    private val serverRef: ActorRef = factory.actorOf(Props[IcbcServer],"server")

    //3.客服开始工作
    // netstat -anb | more 命令,查看端口是否已经被监听
    serverRef ! "start"



}
