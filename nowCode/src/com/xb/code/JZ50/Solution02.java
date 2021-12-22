package com.xb.code.JZ50;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/21 13:49
 * @Version 1.0
 **/
public class Solution02 {
  public int FirstNotRepeatingChar(String str) {
    // 每个位置都是0
    int[] dp = new int[123];
    char[] c = str.toCharArray();
    for (int i = 0; i < c.length; i++) {
      // 每次出现一次，++1
      dp[str.charAt(i)]++;
    }

    for (int i = 0; i < str.length(); i++) {
      // 找到每个元素位置上的值，如果是1，返回
      if (dp[str.charAt(i)] == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Solution02 solution02 = new Solution02();
    System.out.println(solution02.FirstNotRepeatingChar("google"));
  }
}
