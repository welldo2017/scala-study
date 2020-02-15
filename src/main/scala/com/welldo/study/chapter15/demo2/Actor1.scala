package com.welldo.study.chapter15.demo2
import akka.actor.{Actor, ActorRef}

/**
  * actor 入门案例2:
  *     相互通信(本机的两个对象, 之间相互通信)
  *
  * Actor1想要给Actor2发消息,需要持有 Actor2 的引用
  *
  *  author : welldo
  * date : 2020-02-15 15:24
  */
class Actor1 (Actor2Ref: ActorRef) extends Actor {
    var count:Int = 0

    override def receive: Receive = {
        case "游戏开始" => {
            println("actor1 先加入游戏")
            println()
            //给自己发消息
            self ! "start"
        }

        //既可以接收来自自己的start ,也可以接收Actor2的start, 所有Actor的start 消息
        case "start" =>{
            count += 1
            printf("zhang3: 你拍=%d,我拍=%d\n",count,count)

            //给 Actor2 发消息 "go"
            Actor2Ref ! "go2"

            //满10次,停止自己
            if (count == 10) {
                println("zhang3 exit")
                context.stop(self)
            }
        }
    }

}
