package com.welldo.study.chapter11.function3;

import java.util.HashMap;

/**
 * 综合应用: 练习2, 先使用java实现
 *
 * val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
 * 使用映射集合，统计一句话中，各个字母出现的次数
 * 提示：Map[Char, Int]()
 *
 * @author: welldo
 * date: 2019/12/21 15:47
 */
public class ComprehensiveExercise2 {
    public static void main(String[] args) {
        String sentence = "abbcccddddeeeee";

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] charArray = sentence.toCharArray();
        for (char c : charArray) {
            if (hashMap.containsKey(c)) {
                Integer count = hashMap.get(c);
                hashMap.put(c, count+1);
            }else {
                hashMap.put(c,1);
            }
        }
        System.out.println(hashMap);
    }

}
