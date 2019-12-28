package com.welldo.study.chapter10.java0;

import java.util.ArrayList;
import java.util.List;

/**
 * 回顾:java中的可变与不可变
 *
 * @author: welldo
 * @date: 2019/12/12 15:23
 */
public class Demo1 {
    public static void main(String[] args) {
        //1. 不可变,类似于java的数组,开辟一个长度为3的内存空间
        int[] nums = new int[3];

        //给第4个位置上赋值, 报错ArrayIndexOutOfBoundsException, 即不能动态增长
        //nums[3] = 6;


        //2.可变集合举例
        List<String>  arrayList= new ArrayList<>();
        arrayList.add("ZHangSan1");
        arrayList.add("ZHangSan2");
        System.out.println("地址值: "+arrayList.hashCode());

        arrayList.add("ZHangSan3");
        System.out.println("地址值: "+arrayList.hashCode());
    }
}
