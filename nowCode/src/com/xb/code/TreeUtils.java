package com.xb.code;

import java.util.Stack;


/**
 * @ClassName TreeUtils
 * @Description TODO
 * @Author xb
 * @Date 2021/12/1 15:19
 * @Version 1.0
 **/
public class TreeUtils {

  /**
   * 前序遍历
   */
  public static Stack<TreeNode> prologueTraversal(TreeNode root){

    Stack<TreeNode> stack = new Stack<>();
    if(root==null){
      return stack;
    }
    stack.add(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      System.out.print(node.val+"-");
      if (node.right != null) {
        stack.push(node.right);
      }
      if(node.left!=null){
        stack.push(node.left);
      }
    }
    return stack;
  }

  public static void preorderTraversal(TreeNode root){
    Stack<TreeNode> stack = new Stack<>();
    while (root!=null || !stack.isEmpty()){
      while (root!=null){
        stack.push(root);
        System.out.print(root.val+" ");
        root = root.left;
      }
      root = stack.pop();
      root = root.right;
    }
  }

  /**
   * 递归实现前序遍历
   * @param
   */

  public static void preorderTraversal1(TreeNode node){
      if(node!=null) {
        System.out.println(node.val + " ");
        preorderTraversal1(node.left);
        preorderTraversal1(node.right);
      }
  }


  /**
   * 递归实现中序遍历
   * @param node
   */
  public static void inorderTraversal(TreeNode node){
    if(node!=null){
      inorderTraversal(node.left);
      System.out.print(node.val);
      inorderTraversal(node.right);
    }
  }

  public static void inorderTraversal1(TreeNode root){
    Stack<TreeNode> stack = new Stack<>();
    if (root==null) {
      return ;
    }

    while (!stack.isEmpty() || root!=null){
      while (root!=null){
        stack.push(root);
        root = root.left;
      }
      if(!stack.isEmpty()){
        root = stack.pop();
        System.out.print(root.val+" ");
        root = root.right;
      }
    }
  }


  public static void afterOrderTraversal(TreeNode root){
    if(root!=null){
      afterOrderTraversal(root.left);
      afterOrderTraversal(root.right);
      System.out.print(root.val+"->");
    }
  }

  public static void afterOrderTraversal1(TreeNode root){
    Stack<TreeNode> stack = new Stack<>();
    if (root==null) {
      return ;
    }
    TreeNode prev = null;
    while (!stack.isEmpty()||root!=null){
        while (root!=null){
          // 访问左子树
          stack.push(root);
          root = root.left;
        }
        // 判断栈顶元素
        root = stack.peek();
        // 如果此时的跟右子树为空 node.right == null
        // 如果此时的根的右子树已经访问过了 node.right == prev(prev 记录的是上次访问打印的节点)
        if(root.right==null || root.right==prev ){
          // 打印根节点，并出栈
          stack.pop();
          System.out.print(root.val+" ");
          prev = root;
          // node 置为 null,就不会再次访问以node为根节点的左右子树，这里的node既然已经打印，说明他的左右子树已经访问过了
          root = null;
        }else{
          root = root.right;
        }
    }
  }

}
