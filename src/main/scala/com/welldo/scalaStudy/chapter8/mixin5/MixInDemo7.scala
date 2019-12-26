package com.welldo.scalaStudy.chapter8.mixin5

/**
  * 1.特质可以继承类，以用来拓展该特质的一些功能
  *
  * 2.所有混入该特质(A)的类(b)，会自动成为那个特质所继承的超类(c)的子类
  *   也就是说, b会成为c的子类
  *
  * 3.如果混入该特质(A)的类(b)，已经继承了另一个类(bb类)，则要求bb类是特质超类(c)的子类，
  *  也就是要求, bb是c的子类
  *  图示
  *         c
  *      //   \\
  *      A     bb
  *      \\  //
  *        b
  *  如果bb是 D的子类, 那么这就是多重继承, jdk只支持单继承.
  *
  *
  * @author welldo
  * date 2019/12/25
  */
object MixInDemo7 {
  def main(args: Array[String]): Unit = {
    println(1)
  }
}


//1.
trait LoggedException extends Exception{
  def log(): Unit ={
    println(getMessage()) // 方法来自于Exception类
  }
}

//2. UnhappyException 就是Exception的子类.
class UnhappyException extends LoggedException{
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}


//3.通过.
//IndexOutOfBoundsException 和  LoggedException 都是Exception
class UnhappyException2 extends IndexOutOfBoundsException with LoggedException

//3. 无法通过.
class CCC
class UnhappyException3 extends CCC with LoggedException