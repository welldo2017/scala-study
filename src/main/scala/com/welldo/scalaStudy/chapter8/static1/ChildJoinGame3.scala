package com.welldo.scalaStudy.chapter8.static1

/**
  * 伴生对象解决小孩游戏问题
  * 有一群小孩在玩堆雪人,不时有新的小孩加入,请问如何知道现在共有多少人在玩?请使用面向对象(oo)的思想，编写程序解决。
  *
  * author: welldo
  * date: 2019/12/8 16:17
  */
object ChildJoinGame3 {
    def main(args: Array[String]): Unit = {
        val child1 = new Child("蜘蛛精")
        val child2 = new Child("白骨精")
        val child3 = new Child("玉面公主")

        Child.joinGame(child1)
        Child.joinGame(child2)
        Child.joinGame(child3)

        Child.showTotalChildrenNum()
    }
}

class Child(cName: String) {
    var name: String = cName
}

object Child {
    //初始总数
    var totalChildrenNum = 0

    //加入游戏,总数+1
    def joinGame(child: Child) = {
        println(child.name + "加入了游戏;")
        totalChildrenNum += 1
    }

    def showTotalChildrenNum() = {
        printf("当前游戏中共有%d个小孩", totalChildrenNum)
    }
}
