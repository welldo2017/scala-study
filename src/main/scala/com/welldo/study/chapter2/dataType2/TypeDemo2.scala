package com.welldo.study.chapter2.dataType2

/**
  * 部分值类型的数据类型的范围
  *
  * byte:   1字节,8位,范围: (-2的7次方) ~ (+2的7次方-1)
  * short:  2字节,16位,范围:依次类推
  * int:    4字节,32位,范围:依次类推
  * long:   8字节,64位,范围:依次类推
  * float:  4字节,32位,范围:依次类推
  * double: 8字节,64位,范围:依次类推
  *
  * char:   2字节,16位,无符号Unicode字符
  * boolean: true/false
  * Unit:   ()
  * Null:   null
  *
  * 一个字节=8位
  * author: welldo 
  * date: 2019/11/26 10:54
  */
object TypeDemo2 {
  def main(args: Array[String]): Unit = {

    //使用现成的方法获取
    val byteMin: Byte = Byte.MinValue
    val byteMax: Byte = Byte.MaxValue
    printf("min=%d,max=%d\n",byteMin,byteMax)

    val intMin: Int = Int.MinValue
    val intMax: Int = Int.MaxValue
    printf("min=%d,max=%d\n",intMin,intMax)

    //人工计算 todo,后面学完运算符,再来学习






  }

}
