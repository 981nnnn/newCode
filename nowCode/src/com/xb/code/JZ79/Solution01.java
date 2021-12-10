package com.xb.code.JZ79;

import com.xb.code.TreeNode;

/**
 * @ClassName Solution01
 * @Description TODO
 * @Author xb
 * @Date 2021/12/10 11:01
 * @Version 1.0
 **/
public class Solution01 {

  public boolean IsBalanced_Solution(TreeNode root) {
    return getDepth(root) != -1;
  }

  private int getDepth(TreeNode root){
    if (root==null) {
      return 0;
    }
    int left = getDepth(root.left);

    if (left==-1) {
      return -1;
    }

    int right = getDepth(root.right);

    if (right==-1) {
      return -1;
    }

    System.out.println(Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right));
    return Math.abs(left-right) > 1 ? -1 : 1+Math.max(left,right);

  }

  public static void main(String[] args) {
    Solution01 s = new Solution01();
//    TreeNode node1 = new TreeNode(1);
//    TreeNode node2 = new TreeNode(2);
//    TreeNode node3 = new TreeNode(3);
//    TreeNode node4 = new TreeNode(4);
//    TreeNode node5 = new TreeNode(5);
//    TreeNode node6 = new TreeNode(6);
//    TreeNode node7 = new TreeNode(7);
//
//    node2.left = node4;
//    node2.right = node5;
//
//    node1.left = node2;
//
//    node3.left = node6;
//    node3.right = node7;
//
//    node1.right = node3;
//
//    Solution01 s = new Solution01();
//    System.out.println(s.IsBalanced_Solution(node1));
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    TreeNode node6 = new TreeNode(6);
    TreeNode node7 = new TreeNode(7);

    node1.left = node2;
    node2.left = node3;
    node2.right = node4;

    s.IsBalanced_Solution(node1);



  }
}
