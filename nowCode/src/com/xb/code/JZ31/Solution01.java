package com.xb.code.JZ31;

import java.util.Stack;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/15 9:54
 * @Version 1.0
 **/
public class Solution01 {
  public static boolean IsPopOrder(int[] pushA, int[] popA) {
    Stack<Integer> stack = new Stack<>();
    int i = 0;
    int j = 0;
    while (i < pushA.length) {
      if(pushA[i]!=popA[j]){
        stack.push(pushA[i++]);
      }else{
        ++j;
        ++i;
        while (!stack.empty() && stack.peek()==popA[j]){
          stack.pop();
          ++j;
        }
      }
    }
    return stack.empty();
  }

  public static void main(String[] args) {
    int []pushA = {1,2,3,4,5};
    int []popA = {4,5,3,2,1};
    IsPopOrder(pushA,popA);
  }
}
