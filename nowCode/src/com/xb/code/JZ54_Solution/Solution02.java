package com.xb.code.JZ54_Solution;

import com.xb.code.TreeNode;

/**
 * @ClassName Solution02
 * @Description TODO
 * @Author xb
 * @Date 2021/12/1 14:13
 * @Version 1.0
 **/
public class Solution02 {

  static int count = 0;
  static int result = -1;


  public static int KthNode(TreeNode proot, int k) {
    if (proot == null || k < 1) {
      return -1;
    }
    KthNode(proot.left, k);
    ++count;
    if (count == k) {
      return result = proot.val;
    }
    KthNode(proot.right, k);
    return result;
  }

  public static void main(String[] args) {
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    TreeNode node6 = new TreeNode(6);
    TreeNode node7 = new TreeNode(7);
    TreeNode node8 = new TreeNode(8);

    node3.left = node2;
    node3.right = node4;

    node5.left = node3;

    node7.left = node6;
    node7.right = node8;

    node5.right = node7;

    int i = KthNode(node5, 3);

    System.out.println(i);

  }
}
