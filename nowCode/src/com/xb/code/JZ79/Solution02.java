package com.xb.code.JZ79;

import com.xb.code.TreeNode;

/**
 * @ClassName Solution02
 * @Description TODO
 * @Author xb
 * @Date 2021/12/10 11:29
 * @Version 1.0
 **/
public class Solution02 {

  public boolean IsBalanced_Solution(TreeNode root) {
    if (root==null) {
      return true;
    }
    //  IsBalanced_Solution(TreeNode root) 递归调用，保证每个节点都是平衡二叉树
    return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right) ;
  }

  /**
   * 获取二叉树的高度
   * @param root 根节点
   * @return 树的高度
   */
  private int maxDepth(TreeNode root){
    if(root==null){
      return 0;
    }
    // 递归获取高度
    return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
  }

  public static void main(String[] args) {
    Solution02 solution02 = new Solution02();
//    TreeNode node1 = new TreeNode(1);
//    TreeNode node2 = new TreeNode(2);
//    TreeNode node3 = new TreeNode(3);
//
//    node1.left = node2;
//    node1.right= node3;
//    Solution02 solution02 = new Solution02();
//    int i = solution02.maxDepth(node1);
//    System.out.println(i);

//    TreeNode node1 = new TreeNode(1);
//    TreeNode node2 = new TreeNode(2);
//    TreeNode node3 = new TreeNode(3);
//    TreeNode node4 = new TreeNode(4);
//    TreeNode node5 = new TreeNode(5);
//    TreeNode node6 = new TreeNode(6);
//    TreeNode node7 = new TreeNode(7);
//
//    node3.left = node6;
//    node3.right = node7;
//
//    node4.right = node3;
//
//    node2.left = node4;
//    node2.right = node5;
//
//    node1.left = node2;
//
//    Solution02 solution02 = new Solution02();
//    int i = solution02.maxDepth(node1);
//    System.out.println(solution02.IsBalanced_Solution(node1));
//    System.out.println(i);


    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    TreeNode node6 = new TreeNode(6);



    node3.right = node5;
    node4.left = node6;
    node2.left = node4;
    node1.left= node2;
    node1.right = node3;
    System.out.println(solution02.maxDepth(node1));
    System.out.println(solution02.IsBalanced_Solution(node1));

  }
}
