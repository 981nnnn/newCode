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
  // 层次遍历（利用广度优先遍历的思想）
  public  ArrayList printFormTopToBottom(TreeNode root){
    // 利用队列先进先出的规则
    Queue<TreeNode> queue = new LinkedList();
    // 利用list存储结果
    ArrayList<Integer> res = new ArrayList<>();
    if(root==null){
      return res;
    }
    // 将头节点加入到队列中
    queue.add(root);
    // 判断队列中是否为空
    while (!queue.isEmpty()) {
      //取出队列中，头部元素
      TreeNode head = queue.poll();
      // 头部元素左节点是否为空
      if (head.left != null) {
        queue.add(head.left);
      }
      // 头部节点右节点是否为空
      if (head.right != null) {
        queue.add(head.right);
      }
      // 将队列中头节点元素的值，加入到集合中
      res.add(head.val);
    }

    return res;
  }

  public static void main(String[] args) {
  }


}
