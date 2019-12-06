package com.welldo.scalaStudy.chapter7.overrideField7;

/**
 * 在Java中只有方法的重写，没有属性/字段的重写，准确的讲，是隐藏字段代替了重写。
 *
 * 问题: 创建了两个sub对象, 为什么第二个对象 打印出来的结果是 super呢?
 *
 * 官方文档:
 *  字段隐藏的概念: 父类和子类定义了同名的字段, 不会报错
 *  用父类的引用去取值,会取到父类中的字段
 *  用子类的引用去取值, 会取到子类中的字段
 *  在实际开发中, 父类子类要避免使用相同字段名
 *
 *
 * @author welldo
 * @date 2019/12/5
 */
public class JavaFieldOverride1 {
    public static void main(String[] args) {
        //输出sub
        Sub sub = new Sub();
        System.out.println(sub.s);

        //输出 super
        Super sub1 = new Sub();
        System.out.println(sub1.s);
    }
}

class Super{
    String s = "super";
}

class  Sub extends Super{
    String s = "sub";
}
