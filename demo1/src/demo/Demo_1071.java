package demo;

/**
 * @Description: 字符串的最大公因子
 * @Author by bbjxiawei
 * @Date 2023-07-02 19:55
 **/
public class Demo_1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    //辗转相处，
    //最大公因数两个数的最大公约数等于其中较小的数字和二者之间余数的最大公约数
    //GCD（较大数，较小数）= GCD（较小数，二者余数）
    //https://zhuanlan.zhihu.com/p/324578532
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
}
