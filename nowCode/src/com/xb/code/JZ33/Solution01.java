package com.xb.code.JZ33;

/**
 * @ClassName Solution01
 * @Description TODO
 * @Author xb
 * @Date 2021/12/6 16:29
 * @Version 1.0
 **/
public class Solution01 {

  public static boolean verifySquenceOfBST(int []sequence){
    int len = sequence.length;
    if (len==0) {
      return false;
    }
    return  help(sequence,0,len-1);
  }

  public static boolean help(int []sequence,int start, int end){
    if (start>=end) {
      return true;
    }
    int root = sequence[end];
    int index = -1;

    for (int i = 0; i < end; i++) {
      if (sequence[i]<root) { // 无重复的元素
        index ++;
      }
    }


    for (int i = index+1; i <end ; i++) {
      if(sequence[i]<root){
        return false;
      }
    }


    return help(sequence,start,index) && help(sequence,index+1,end-1);
  }

  public static void main(String[] args) {
    int []sequence = {1,3,2};
    System.out.println(verifySquenceOfBST(sequence));
  }
}
