package com.xb.code;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName JZ77_Solution
 * @Description TODO
 * @Author xb
 * @Date 2021/11/30 9:43
 * @Version 1.0
 **/
public class JZ77_Solution {
  public static void main(String[] args) {
    Deque deque = new LinkedList();

  }

  public ArrayList Print(TreeNode pRoot) {
    Deque<TreeNode> deque = new LinkedList<>();
    ArrayList res = new ArrayList<>();
    if(pRoot != null) deque.add(pRoot);
    while(!deque.isEmpty()) {
      // 打印奇数层
      ArrayList tmp = new ArrayList<>();
      for(int i = deque.size(); i > 0; i--) {
        // 从左向右打印
        TreeNode node = deque.removeFirst();
        tmp.add(node.val);
        // 先左后右加入下层节点
        if(node.left != null) deque.addLast(node.left);
        if(node.right != null) deque.addLast(node.right);
      }
      res.add(tmp);
      if(deque.isEmpty()) break; // 若为空则提前跳出
      // 打印偶数层
      tmp = new ArrayList<>();
      for(int i = deque.size(); i > 0; i--) {
        // 从右向左打印
        TreeNode node = deque.removeLast();
        tmp.add(node.val);
        // 先右后左加入下层节点
        if(node.right != null) deque.addFirst(node.right);
        if(node.left != null) deque.addFirst(node.left);
      }
      res.add(tmp);
    }
    return res;
  }
}
