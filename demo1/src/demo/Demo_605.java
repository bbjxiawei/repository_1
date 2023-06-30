package demo;

import java.util.Arrays;

public class Demo_605 {
    /**
     * 假设有一个很长的花坛，一部分地块种植了花，
     * 另一部分却没有。
     * 可是，花不能种植在相邻的地块上，
     * 它们会争夺水源，两者都会死去。
     * <p>
     * 给你一个整数数组flowerbed 表示花坛，
     * 由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。
     * 另有一个数n ，能否在不打破种植规则的情况下种入n朵花？
     * 能则返回 true ，不能则返回 false。
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        if (m == 1) { // 如果花坛长度为1
            // 则未种花时可以种入0、1朵花，种花时可以种入0朵花
            return flowerbed[0] == 0 && n <= 1 || flowerbed[0] == 1 && n == 0;
        }
        /* 以下为花坛长度大于1的情况 */
        // 可种花的数量，初始为0或1，取决于花坛前两个位置的种花情况
        int plant = (flowerbed[0] + flowerbed[1] == 0 ? 1 : 0);
        /* 从花坛第三个位置开始，到倒数第三个位置为止 */
        for (int i = 2; i < m - 2; i++) {
            // 如果当前位置及其前后位置均未种花
            if (flowerbed[i - 1] + flowerbed[i] + flowerbed[i + 1] == 0) {
                plant++; // 则可种花的数量增加1
                flowerbed[i] = 1; // 在当前位置上种花
            }
        }
        if (m > 2) { // 花坛的长度大于2时，需要考虑花坛的最后两个位置
            if (flowerbed[m - 1] + flowerbed[m - 2] == 0) { // 均未种花
                plant++; // 则可种花的数量增加1
            }
        }
        return plant >= n; // 可种花的数量不小于待种花的数量，则返回true，否则false
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }
}
