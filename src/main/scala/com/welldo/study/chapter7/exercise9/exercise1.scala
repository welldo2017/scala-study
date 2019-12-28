package com.welldo.study.chapter7.exercise9

/**
  * 练习1
  * 编写computer类, 包含 cpu型号,内存大小,硬盘大小, 等属性, getDetails 方法用于返回这些信息
  *
  * 编写PC子类, 继承computer,添加特有属性: 品牌brand
  * 编写notePad子类, 继承computer,添加特有属性: 颜色color
  *
  * 编写 exercise1, 在main方法中创建pc 和notePad对象, 给对象中所有属性(继承属性+特有属性)赋值,并使用getDetails 方法打印
  *
  * author: welldo 
  * date: 2019/12/8 13:23
  */
object exercise1 {
    def main(args: Array[String]): Unit = {
        val pc = new PC
        pc.cpu = "core i7"
        pc.memory = 8
        pc.hardDisk = 256
        pc.brand = "lenovo"
        pc.getDetails()
    }

}

class computer {
    var cpu: String = _
    var memory: Int = _
    var hardDisk: Int = _

    def getDetails ()={
        printf("cpu:%s, memory:%d, hardDisk:%d",cpu,memory,hardDisk)
    }
}

class PC extends computer {
    var brand: String = _
    override def getDetails ()={
        printf("cpu:%s, memory:%d, hardDisk:%d, brand:%s",cpu,memory,hardDisk,brand)
    }
}

class NotePad extends computer {
    var color: String = _
}


