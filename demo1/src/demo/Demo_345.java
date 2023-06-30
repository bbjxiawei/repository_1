package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo_345 {
    /**
     * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
     * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。
     */

    public static String reverseVowels(String s) {
        List<Character> vowelsList = new ArrayList<>();
        vowelsList.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ) {
            while (i < chars.length && !vowelsList.contains(chars[i])) {
                i++;
            }
            while (j > 0 && !vowelsList.contains(chars[j])) {
                j--;
            }
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
