package com.xb.code.JZ78;

import com.xb.code.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>把二叉树打印成多行</p>
 *
 * @Author xb
 * @Date 2021/12/13 13:20
 * @Version 1.0
 **/
public class Solution01 {
  ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    if (pRoot == null) {
      return res;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(pRoot);
    while (!queue.isEmpty()) {
      ArrayList<Integer> list = new ArrayList<>();
      int lo = 0;
      int hi = queue.size();
      while (lo++ < hi) {
        TreeNode node = queue.poll();
        if (node != null) {
          list.add(node.val);
        }
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      res.add(list);
    }
    return res;
  }
}
