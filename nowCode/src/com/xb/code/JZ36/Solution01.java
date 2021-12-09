package com.xb.code.JZ36;

import com.xb.code.TreeNode;
import com.xb.code.TreeUtils;

/**
 * @ClassName Solution01
 * @Description TODO
 * @Author xb
 * @Date 2021/12/9 20:02
 * @Version 1.0
 **/
public class Solution01 {
  TreeNode pre = null;
  TreeNode root = null;

  public TreeNode Convert(TreeNode pRootOfTree) {
    if (pRootOfTree==null) {
      return null;
    }
    //递归遍历左子树
    Convert(pRootOfTree.left);
    // 判断特殊情况
    if (root==null) {
      root = pRootOfTree;
    }

    if (pre != null) {
      pRootOfTree.left = pre;
      pre.right = pRootOfTree;
    }
    // 更新pre
    pre = pRootOfTree;
    Convert(pRootOfTree.right);
    return root;
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

    Solution01 s = new Solution01();
    TreeNode convert = s.Convert(node2);

    TreeUtils.preorderTraversal(convert);
    System.out.println(convert);


  }
}
