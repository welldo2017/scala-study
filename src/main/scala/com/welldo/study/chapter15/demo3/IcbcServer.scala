package com.welldo.study.chapter15.demo3

import akka.actor.Actor

/**
  * IcbcServer 是被动者,不需要持有其他actor的ref,(可以通过sender方法来获取)
  *
  * author : welldo
  * date : 2020-02-15 18:20
  */
class IcbcServer extends Actor {
    override def receive: Receive = {
        case "start" => {
            println("工作人员已上线,可以咨询了...")
        }

    }

}
