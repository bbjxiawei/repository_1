package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo_1431 {
    /**
     * 给你一个数组candies和一个整数extraCandies，其中candies[i]代表第 i 个孩子拥有的糖果数目。
     * <p>
     * 对每一个孩子，检查是否存在一种方案，将额外的extraCandies个糖果分配给孩子们之后，
     * 此孩子有 最多的糖果。注意，允许有多个孩子同时拥有 最多的糖果数目
     */

    // public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    //     List<Boolean> result = new ArrayList<>();
    //     //获取最大值
    //     int maxValue = Arrays.stream(candies).max().getAsInt();
    //     //循环
    //     candies = Arrays.stream(candies).map(s -> s + extraCandies).toArray();
    //     for (int i = 0; i < candies.length; i++) {
    //         if (candies[i] >= maxValue) {
    //             result.add(true);
    //         } else {
    //             result.add(false);
    //         }
    //     }
    //     return result;
    // }、

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxCandies = 0;
        for (int i = 0; i < n; ++i) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        List<Boolean> ret = new ArrayList<Boolean>();
        for (int i = 0; i < n; ++i) {
            ret.add(candies[i] + extraCandies >= maxCandies);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] ints = {4, 2, 1, 1, 2};
        System.out.println(kidsWithCandies(ints, 1));
    }
}
