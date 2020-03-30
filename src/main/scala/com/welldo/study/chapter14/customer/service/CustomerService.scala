package com.welldo.study.chapter14.customer.service

import com.welldo.study.chapter14.customer.bean.Customer

import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._

/**
  *
  * author : welldo
  * date : 2020-02-09 16:21
  */
class CustomerService {
    //自增长的id,初始为1
    var customerId:Int = 1

    //用来保存客户的
    var customerList = new ArrayBuffer[Customer]()

    /**
      * 获取客户列表
      */
    def getList()={
        customerList
    }

    /**
      * 添加客户
      */
    def addCustomer(customer: Customer)={
        //给id赋值
        customer.id = customerId

        customerList.append(customer)

        //id 增长
        customerId += 1
    }

    /**
      * 删除客户
      */
    def deleteCustomerById(id:Int)={
        val index = findIndexById(id)
        if (index== -1) {
            false
        }else{
            customerList.remove(index)
            true
        }
    }


    /**
      * 通过id查找customerList中的索引
      */
    def findIndexById(id:Int)= {
        var index :Int = -1

        breakable {
            for (elem <- 0 until customerList.length) {
                if (customerList(elem).id == id) {
                    index = elem

                    break()
                }
            }
        }
        index
    }




}
