package com.xb.code.JZ34;

import com.xb.code.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @ClassName Solution01
 * @Description TODO
 * @Author xb
 * @Date 2021/12/8 15:48
 * @Version 1.0
 **/
public class Solution01 {

  ArrayList res = new ArrayList<String>();
  LinkedList path = new LinkedList();

  public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int expectNumber) {
    dfs(root, expectNumber);
    return res;
  }

  public void dfs(TreeNode root, int tar) {
    if (root == null) {
      return;
    }
    // 将root节点放入路径集合
    path.add(root.val);
    // 更新目标值，每放入一个节点，目标值应该相应减去对应节点的值，
    tar -= root.val;

    if (tar == 0 && root.left == null && root.right == null) {
      res.add(new ArrayList(path));
    }

    dfs(root.left, tar);
    dfs(root.right, tar);

    // 删除当前节点，在回溯过程，此节点不在新路径上
    path.removeLast();
  }

  public static void main(String[] args) {
    TreeNode node10 = new TreeNode(10);
    TreeNode node5 = new TreeNode(5);
    TreeNode node4 = new TreeNode(4);
    TreeNode node7 = new TreeNode(7);
    TreeNode node12 = new TreeNode(12);

    node5.left = node4;
    node5.right = node7;

    node10.left = node5;

    node10.right = node12;
    Solution01 s = new Solution01();
    ArrayList<ArrayList<Integer>> arrayLists = s.FindPath(node10, 22);

    System.out.println("rrrr");
  }
}
