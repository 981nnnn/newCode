package com.xb.code.JZ53;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/16 14:42
 * @Version 1.0
 **/
public class Solution02 {
  public int GetNumberOfK(int[] array, int k) {
    int lbound = 0;
    int rbound = 0;
    int l = 0;
    int r = array.length;
    while (l < r) {
      int mid = (l + r ) / 2;
      if(array[mid]<k){
        l = mid+1;
      }else {
        r = mid;
      }
    }
    lbound = l;

    l = 0;
    r = array.length;

    while (l<r){
      int mid = (l + r ) / 2;
      if(array[mid]<=k){
        l = mid+1;
      }else{
        r = mid;
      }
    }
    rbound = l;
    return rbound - lbound;
  }

  public static void main(String[] args) {
    int []array = {1,2,3,3,3,3,4,5};
    Solution02 solution02 = new Solution02();
    System.out.println(solution02.GetNumberOfK(array, 4));
  }
}
