package com.xb.code.JZ11;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/17 11:16
 * @Version 1.0
 **/
public class Solution01 {
  public int minNumberInRotateArray(int [] array) {
    if(array.length == 0){
      return 0;
    }
    int first = 0;
    int last = array.length-1;
    while(last>first){
      int mid = first+(last-first) / 2;
      if(array[first]<array[last]){
        return array[first];
      }else if(array[mid]<array[last]){
        last = mid;
      }else if(array[mid]>array[last]){
        first = mid + 1;
      }else{
        last--;
      }
    }
    return array[first];
  }

  public static void main(String[] args) {
    int []array = {3,4,5,1,2};
    Solution01 solution01 = new Solution01();
    System.out.println(solution01.minNumberInRotateArray(array));
  }
}
