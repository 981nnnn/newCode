package com.xb.code.JZ29;

import java.util.ArrayList;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2022/1/4 9:37
 * @Version 1.0
 **/
public class Solution01 {
  public ArrayList<Integer> printMatrix(int[][] matrix) {
    ArrayList<Integer> res = new ArrayList<>();
    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length-1;
    //
    int i = 0;
    int j = 0;
    while (top <= bottom && left <= right) {
      // 遍历顶部
      while (j<=right){
        res.add(matrix[top][j]);
        ++j;
      }
      ++top;
      i = top;
      j = right;
      // 遍历右边

      while (i<=bottom){
        res.add(matrix[i][right]);
        i++;
      }
      --right;
      i = bottom;
      j = right;

      // 遍历底部
      while (j>=left){
        res.add(matrix[bottom][j]);
        j--;
      }
      --bottom;
      i = bottom;
      j =  left;
      // 遍历左边
      while (i>=top){
        res.add(matrix[i][left]);
        --i;
      }
      ++left;
      i = top;
      j = left;
    }
    return res;
  }

  public static void main(String[] args) {
    int [][] matrix = {{1,2,3,4,5}};
    Solution01 solution01 = new Solution01();
    ArrayList<Integer> list = solution01.printMatrix(matrix);
    System.out.println(list.toArray());
  }
}
