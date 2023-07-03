package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 拥有最多糖果的孩子
 * @Author by bbjxiawei
 * @Date 2023-07-03 19:29
 **/
public class Demo_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        //获取最大值
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        //结果
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >= maxCandies);
        }
        return list;
    }

}
