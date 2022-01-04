package com.xb.code.JZ29;

import java.util.ArrayList;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2022/1/4 9:37
 * @Version 1.0
 **/
public class Solution02 {
  public ArrayList<Integer> printMatrix(int[][] matrix) {
    ArrayList<Integer> res = new ArrayList<>();
    int top = 0;
    int bootom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length-1;

    while (top<=bootom && left<=right){
      for(int i= left;i<=right;i++){
        res.add(matrix[top][i]);
      }
      top++;
      for(int j = top;j<=bootom;j++){
        res.add(matrix[right][j]);
      }
      right--;
      if(bootom>=top) {
        for (int i = right; i >= left; i--) {
          res.add(matrix[bootom][i]);
        }
        bootom--;
      }
      if(left<=right) {
        for (int j = bootom; j >= top; j--) {
          res.add(matrix[left][j]);
        }
        left++;
      }
    }



    return res;
  }

  public static void main(String[] args) {
    int [][] matrix = {{1,2,3,4,5}};
    Solution02 solution01 = new Solution02();
    ArrayList<Integer> list = solution01.printMatrix(matrix);
    System.out.println(list.toArray());
  }
}
