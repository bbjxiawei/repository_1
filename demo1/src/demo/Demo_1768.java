package demo;

import java.util.Arrays;

public class Demo_1768 {
    // 给你两个字符串 word1 和 word2 。
    // 请你从 word1 开始，通过交替添加字母来合并字符串。
    // 如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
    // 返回 合并后的字符串 。
    // public static String mergeAlternately(String word1, String word2) {
    //     //定义两个指针
    //     int w1 = 0, w2 = 0;
    //     //定义数组
    //     String[] str = new String[word1.length() + word2.length()];
    //     //开始交替插元素
    //     for (int i = 0; i < str.length; ) {
    //         //判断w1位置有没有元素
    //         if (w1 < word1.length() && word1.charAt(w1) != ' ') {
    //             str[i] = word1.charAt(w1) + "";
    //             i++;
    //             w1++;
    //         }
    //         //判断w2位置有没有元素
    //         if (w2 < word2.length() && word2.charAt(w2) != ' ') {
    //             str[i] = word2.charAt(w2) + "";
    //             w2++;
    //             i++;
    //         }
    //     }
    //     return String.join("", str);
    // }

    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int m = word1.length();
        int n = word2.length();
        StringBuilder sb = new StringBuilder();
        while (i < m && j < n) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        while (i < m) {
            sb.append(word1.charAt(i++));
        }

        while (j < n) {
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }
}
