package com.welldo.study.chapter14.customer.app

import com.welldo.study.chapter14.customer.controller.CustomerController

/**
  *
  * author : welldo
  * date : 2020-02-09 16:25
  */
object CustomerCRM {
    def main(args: Array[String]): Unit = {
        val view = new CustomerController
        view.mainMenu()

    }

}
