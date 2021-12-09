package com.xb.code.JZ36;

import com.xb.code.TreeNode;
import com.xb.code.TreeUtils;

import java.util.ArrayList;

/**
 * @ClassName Solution02
 * @Description TODO
 * @Author xb
 * @Date 2021/12/9 20:23
 * @Version 1.0
 **/
public class Solution02 {

  public TreeNode Convert(TreeNode root){
    ArrayList<TreeNode> res = new ArrayList<>();
    this.inorder(root,res);
    if (res.size()<=1) {
      return root;
    }
    for (int i = 0; i < res.size()-1; i++) {
      res.get(i).right = res.get(i+1);
      res.get(i+1).left = res.get(i);
    }
    return res.get(0);
  }

  /**
   * 中序遍历
   * @param root
   * @param res
   */
  public void inorder(TreeNode root, ArrayList res){
    if (root != null) {
      inorder(root.left,res);
      res.add(root);
      inorder(root.right,res);
    }
  }


  public static void main(String[] args) {
    TreeNode node1 = new TreeNode(1);
    TreeNode node2  = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4  = new TreeNode(4);
    TreeNode node5  = new TreeNode(5);

    node2.left=  node1;
    node4.left = node3;
    node4.right = node5;
    node2.right = node4;

    Solution02 s = new Solution02();
    TreeNode convert = s.Convert(node2);

    TreeUtils.preorderTraversal(convert);
    System.out.println(convert);


  }
}
