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

        //这是一个错误的示范
        //避免通过一个类的对象引用访问此类的静态变量或静态方法,增加编译器解析成本,直接用类名访问即可
        //InterfaceHandler myHandler1 = new MyHandler12();
        //System.out.println(myHandler1.name);


        //正确示范为(并且这是静态变量, 无法更改,这里不做示范)
        System.out.println(InterfaceHandler.name);
        System.out.println(InterfaceHandler2.name);
    }
}
