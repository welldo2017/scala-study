package com.welldo.study.chapter11.operator6

/**
  * 操作符 扩展
  * 这部分内容没有必要刻意去理解和记忆，语法使用的多了，自然就会熟练的使用
  *
  * 1)如果想在变量名、类名等定义中使用语法关键字（保留字），可以配合反引号反引号(不做演示)
  * val `val` = 42
  *
  * 2)中置操作符：
  * A 操作符 B
  * 等同于
  * A.操作符(B)
  *
  *
  * 3)后置操作符：
  * A操作符
  * 等同于
  * A.操作符
  *
  * 如果操作符定义的时候不带(), 则调用时也不能加, 为了减轻记忆负担, 定义时都加上(), 调用时爱加不加
  * 用后置操作符写法时, 这行代码后请空行!!!!
  *
  *
  * 4)前置操作符，+、-、！、~等操作符A等同于A.unary_操作符(不做演示)
  * 5)赋值操作符，A 操作符= B 等同于 A = A 操作符 B  ，比如 A += B 等价 A = A + B(不做演示)
  *
  *
  * author: welldo 
  * date: 2020/1/4 17:55
  */
object Operator2 {
    def main(args: Array[String]): Unit = {

        // 案例2 举例1.
        val n1: Int = 1
        val n2: Int = 2
        val result1 = n1.+(n2)// 这是标准写法

        //为什么可以写成这样? 因为Int的源码里(363行), 对 + 号进行了重载, 调用的就是 .+() 这个方法
        val result2 = n1 + n2
        println(result1)
        println(result2)
        println("===============")



        //案例2 举例2. 给王思聪加钱
        val cong = new WangSiCong
        cong.+(1)     //标准写法
        cong + 1      //中置操作符写法
        println(cong.money)

        //案例3
        cong.++     //标准写法
        cong ++     //用后置操作符写法时, 这行代码后请空行

        println(cong.money)
        println("===============")
    }
}

class  WangSiCong{
    var money: Int = 0

    //案例2: 对 + 操作符进行重载
    def + (n: Int)={
        this.money += n
    }

    //案例3:
    def ++()  ={
        this.money += 1
    }
}
