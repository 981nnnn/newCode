package com.xb.code.JZ32;

import com.xb.code.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Solution01
 * @Description TODO
 * @Author xb
 * @Date 2021/12/2 22:57
 * @Version 1.0
 **/
public class Solution01 {

  public  ArrayList printFormTopToBottom(TreeNode root){
    Queue<TreeNode> queue = new LinkedList();
    ArrayList<Integer> res = new ArrayList<>();
    if(root==null){
      return res;
    }
    queue.add(root)
    while (!queue.isEmpty()) {
      TreeNode head = queue.poll();
      if (head.left != null) {
        queue.add(head.left);
      }
      if (head.right != null) {
        queue.add(head.right);
      }
      res.add(head.val);
    }

    return res;
  }

  public static void main(String[] args) {
  }
}
