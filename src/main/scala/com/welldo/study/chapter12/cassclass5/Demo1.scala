package com.welldo.study.chapter12.cassclass5

/**
  * 样例类(模板类) 特别重要
  *
  * 1. 首先它是一个类，只是用case 修饰
  * 2. 会在底层，默认生成一系列的方法(copy,hashCode,equals,toString,apply,unapply)
  *    这些方法，我们不用写，直接使用即可, 减少重复性工作
  * 3. 样例类会实现Serializable接口
  *
  * 4)构造器中的每一个参数都成为val——除非它被显式地声明为var（不建议这样做）
  *
  * 5)在样例类对应的伴生对象中提供apply方法
  * 6)提供unapply方法让模式匹配可以工作, 也就是说, 样例类是为 模式匹配(对象) 而优化的类
  *
  * 8)除上述外，样例类和其他类完全一样。你可以添加方法和字段
  *
  * author : welldo 
  * date : 2020/1/11 16:10
  */
object Demo1 {

}

