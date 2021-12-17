package com.xb.code.JZ11;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/17 11:26
 * @Version 1.0
 **/
public class Solution02 {
  public int minNumberInRotateArray(int [] array) {
    if (array.length==0) {
      return 0;
    }
    int num=array[0];
    for (int i : array) {
      if(i<num){
        num = i;
      }
    }
    return num;
  }
}
