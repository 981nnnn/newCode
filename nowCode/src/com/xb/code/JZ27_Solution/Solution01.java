package com.xb.code.JZ27_Solution;

import com.xb.code.TreeNode;

import java.util.Stack;

/**
 * @ClassName Solution01
 * @Description TODO
 * @Author xb
 * @Date 2021/12/1 15:01
 * @Version 1.0
 **/
public class Solution01 {


  public static TreeNode Mirror(TreeNode root){
    if (root==null) {
      return null;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty()){
      // 根节点出栈
      TreeNode pop = stack.pop();
      // 根节点的左子树入栈
      if(pop.left!=null){
        stack.add(pop.left);
      }
      // 根节点的右子树入栈
      if(pop.right!=null){
        stack.add(pop.right);
      }
      // 左右子树交换
      TreeNode left = pop.left;
      pop.left = pop.right;
      pop.right = left;
    }
    return root;
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

    System.out.println(Mirror(node5));


  }
}
