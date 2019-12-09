package com.welldo.scalaStudy.chapter8.java2;

/**
 * 测试 实现 接口
 * author: welldo
 * date: 2019/12/9 17:13
 */
public class TestHandler {
    public static void main(String[] args) {
        MyHandler12 myHandler = new MyHandler12();
        myHandler.beforeHandle();
        myHandler.dealHandle();
        myHandler.afterHandle();
        myHandler.unlessHandle();

        //接口中的变量是常量, 所以无法更改
        InterfaceHandler myHandler1 = new MyHandler12();
        System.out.println(myHandler1.name);

        InterfaceHandler2 myHandler2 = new MyHandler12();
        System.out.println(myHandler2.name);
    }
}
