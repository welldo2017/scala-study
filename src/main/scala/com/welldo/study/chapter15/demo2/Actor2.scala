package com.welldo.study.chapter15.demo2

import akka.actor.Actor

/**
  * 收到别人的消息后,只用 sender() 可以获取到发送者的ref, 即可回复
  *
  * author : welldo
  * date : 2020-02-15 15:24
  */
class Actor2  extends  Actor{
    var count:Int = 0

    override def receive: Receive = {

        //接收到 来自 Actor1 的消息 "go2"
        case "go2" => {
            count += 1
            printf("lisi4: 你拍=%d,我拍=%d.\n",count,count)
            println()

            Thread.sleep(1000)

            //给Actor1 回复消息 "start"
            if (count == 10) {
                //满10次,不仅停止自己,还停止system
                println("li4 exit")
                context.stop(self)
                context.system.terminate()
            }else{
                sender() ! "start"
            }
        }
    }
}
