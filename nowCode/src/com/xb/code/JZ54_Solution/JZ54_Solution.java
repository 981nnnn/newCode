package com.xb.code.JZ54_Solution;

import com.xb.code.TreeNode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;

/**
 * @Description TODO
 * @Author xb
 * @Date 2021/12/1 13:52
 * @Version 1.0
 **/
public class JZ54_Solution {
  /**
   * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
   *
   *
   * @param proot TreeNode类
   * @param k int整型
   * @return int整型
   */
  public static int KthNode (TreeNode proot, int k) {
    // write code here
    if(proot==null){
      return -1;
    }
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(proot);
    TreeNode node = proot;
    int i = 0;
    while(!stack.isEmpty()){
      while(node.left !=null){
        stack.push(node.left);
        node = node.left;
      }
      i++;
      if(i==k){
        return stack.pop().val;
      }
      TreeNode tmp = stack.pop();
      // 加入右子树
      if(tmp.right!=null){
        stack.push(tmp.right);
        node = tmp.right;
      }
    }
    return -1;
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
    node7.right= node8;

    node5.right= node7;

    int i = KthNode(node5, 3);

    System.out.println(i);
    DateFormat df = new SimpleDateFormat("yyyyMMdd");
    Date date = new Date();
    System.out.println(df.format(date));

  }




}
