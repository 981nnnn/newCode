package com.xb.code.JZ63;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2022/1/7 13:51
 * @Version 1.0
 **/
public class Solution02 {
  public int maxProfit (int[] prices) {
    // 边界条件
    if(prices.length==0){
      return 0;
    }
    // 历史最低价
    int lowest = prices[0];
    // 最大利润
    int profit = 0;
    // 遍历数组
    for(int i=1;i<prices.length;i++){
      // 每天早上第一件事就是想想，如果我在最低点买入，在今天卖出能赚多少
      lowest = Math.min(lowest, prices[i]);
      profit = Math.max(profit, prices[i]-lowest);
    }

    return profit;
  }

  public static void main(String[] args) {
    int []prices = {8,2,9,21,5,4,7,1};
    Solution02 solution02 = new Solution02();
    int i = solution02.maxProfit(prices);
    System.out.println(i);
  }
}
