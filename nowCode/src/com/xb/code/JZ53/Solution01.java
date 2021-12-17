package com.xb.code.JZ53;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/16 14:42
 * @Version 1.0
 **/
public class Solution01 {
  public int GetNumberOfK(int [] array , int k) {
    int count = 0;
    for(int i = 0 ; i<array.length;i++){
      if(array[i]==k){
        count++;
      }
    }
    return count;
  }
}
