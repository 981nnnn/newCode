package com.xb.code.JZ63;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2022/1/7 13:51
 * @Version 1.0
 **/
public class Solution01 {
  public int maxProfit (int[] prices) {
    // write code here
    int res = 0;
    for (int i = 0; i < prices.length-1; i++) {
      for (int j = i+1; j < prices.length; j++) {
          if(prices[j]-prices[i] > res){
            res = prices[j] - prices[i];
          }
      }
    }
    return res;
  }
}
