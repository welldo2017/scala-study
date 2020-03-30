package com.welldo.study.chapter14.customer.bean

/**
  *
  * author : welldo
  * date : 2020-02-09 16:00
  */
class Customer {

    //属性
    var id: Int = _

    //姓名
    var name: String = _

    //性别
    var gender: Char = _

    //年龄
    var age: Short = _

    //手机号
    var phone: String = _

    // 邮箱
    var email: String = _

    //todo 复习辅助构造器
    //辅助构造器
    def this(name: String, gender: Char, age: Short, phone: String, email: String) {
        this
        this.age = age
        this.name = name
        this.gender = gender
        this.phone = phone
        this.email = email
    }


    override def toString = s"$id\t\t$name\t\t$gender\t\t$age\t\t$phone\t\t$email"
}
