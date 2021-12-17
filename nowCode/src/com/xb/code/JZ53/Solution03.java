package com.xb.code.JZ53;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/16 15:01
 * @Version 1.0
 **/
public class Solution03 {
  public int GetNumberOfK(int[] array, int k) {
    return biSearch(array, k + 0.5) - biSearch(array, k - 0.5);
  }

  private int biSearch(int[] array, double num) {
    int s = 0;
    int e = array.length - 1;
    while (s <= e) {
      int mid = (e - s) / 2 + s;
      if (array[mid] < num) {
        s = mid + 1;
      } else if (array[mid] > num) {
        e = mid - 1;
      }
    }
    return s;
  }

  public static void main(String[] args) {
    int []array = {1,2,3,3,3,3,4,5};
    Solution03 solution03 = new Solution03();
    System.out.println(solution03.GetNumberOfK(array, 3));
  }
}
