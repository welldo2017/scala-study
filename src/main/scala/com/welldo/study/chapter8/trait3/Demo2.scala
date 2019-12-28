package com.welldo.study.chapter8.trait3

/**
  * 没有父类
  *     class  类名   extends   特质1   with    特质2   with   特质3 ..
  * 有父类
  *     class  类名   extends   父类   with  特质1   with   特质2   with 特质3
  *
  * author: welldo 
  * date: 2019/12/8 17:23
  */
object Demo2 {

}

//在scala中，java中的接口可以当做特质使用
object T1 extends Serializable{

}
object T2 extends Cloneable {

}
