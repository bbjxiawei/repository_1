package demo;

/**
 * 对于字符串s 和t，只有在s = t + ... + t（t 自身连接 1 次或多次）时，我们才认定“t 能除尽 s”。
 * 给定两个字符串str1和str2。返回 最长字符串x，要求满足x 能除尽 str1 且 x 能除尽 str2 。
 */
public class Demo_1071 {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABAB", "ABABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
}
