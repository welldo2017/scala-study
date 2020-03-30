package com.welldo.study.chapter14.customer.controller

import com.welldo.study.chapter14.customer.bean.Customer
import com.welldo.study.chapter14.customer.service.CustomerService

import scala.io.StdIn
import scala.util.control.Breaks._

/**
  *
  * author : welldo
  * date : 2020-02-09 16:21
  */
class CustomerController {

    //循环
    var loop: Boolean = true

    //接收用户输入的菜单数字
    var menuNum: Int = _


    private val customerService = new CustomerService

    //主菜单
    def mainMenu() = {

        println("-----------------客户信息管理软件-----------------")

        do {
            println("请选择菜单序号：")
            println("*** 1 添 加 客 户")
            println("*** 2 修 改 客 户")
            println("*** 3 删 除 客 户")
            println("*** 4 客 户 列 表")
            println("*** 5 退       出")

            //校验输入
            val line = StdIn.readLine().trim
            try {
                menuNum = line.toInt
            } catch {
                case ex: Exception => println("输入不正确,请重新输入")
            }

            menuNum match {
                case 1 => addCustomer()
                case 2 => println("开发中... ...")
                case 3 => deleteCustomer()
                case 4 => getList()
                case 5 => loop = false

                //如果错误输入,则会执行这行代码
                case _ =>
            }
        } while (loop)
    }

    //客户列表
    def getList() = {
        println()
        val list = customerService.getList()
        if (list.length == 0) {
            println("客户列表为空")
        } else {
            println("-------------4 客户列表-------------")
            println("序号\t\t姓名\t\t性别\t\t年龄\t\t手机号\t\t邮箱")
            for (elem <- list) {
                println(elem)
            }
        }
        println()
    }

    //添加客户(todo 这里的输入就不校验了)
    def addCustomer() = {
        println()
        println("-------------5 添加客户-------------")
        println("姓名:")
        val name = StdIn.readLine().trim

        println("性别:")
        val gender = StdIn.readChar()

        println("年龄:")
        val age = StdIn.readShort()

        println("手机号:")
        val phone = StdIn.readLine().trim

        println("邮箱:")
        val email = StdIn.readLine().trim

        //构建对象
        val customer = new Customer(name, gender, age, phone, email)
        customerService.addCustomer(customer)
        println("添加成功!!!")
        println()
    }

    //删除客户(todo 这里的输入就不校验了)
    def deleteCustomer() = {
        println()
        println("-------------3 删除客户-------------")
        println("请输入客户编号:(-1退出)")

        val id = StdIn.readInt()
        if (id == -1) {
            println("已退出,未进行删除操作")
        } else {
            println("请确认是否删除(Y/N)")
            var confirmDelete = ""

            //进入判断 y/n 的循环
            breakable {
                do {
                    confirmDelete = StdIn.readLine().trim.toUpperCase()
                    if (confirmDelete == "Y" || confirmDelete == "N") {
                        break()
                    }
                    println("请确认是否删除(Y/N)")
                } while (true)
            }

            //开始删除
            if (confirmDelete == "Y" ) {
                if (customerService.deleteCustomerById(id)) {
                    println("删除成功")
                } else {
                    println("编号错误,删除失败")
                }
            }else{
                println("已退出,未进行删除操作")
            }
        }
    }


}
