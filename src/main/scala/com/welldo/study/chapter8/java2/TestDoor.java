package com.welldo.study.chapter8.java2;

/**
 * 测试继承 抽象类
 * author: welldo
 * date: 2019/12/9 17:13
 */
public class TestDoor {
    public static void main(String[] args) {
        GlassDoor glassDoor = new GlassDoor();

        System.out.println(glassDoor.name);
        glassDoor.open();
        glassDoor.close();
        glassDoor.alarm();
    }
}
