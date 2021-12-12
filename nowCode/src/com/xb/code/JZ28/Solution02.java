package com.xb.code.JZ28;

import com.xb.code.TreeNode;

/**
 * @ClassName Solution02
 * @Description TODO
 * @Author xb
 * @Date 2021/12/11 13:25
 * @Version 1.0
 **/
public class Solution02 {

  boolean isSymmetrical(TreeNode root){
    if (root == null) {
      return true;
    }
    return comRoot(root.left,root.right);

  }

  private boolean comRoot(TreeNode left,TreeNode right){
    if(left==null) {
      return right==null;
    }
    if(right==null){
      return false;
    }
    if(left.val!=right.val){
      return false;
    }
    return comRoot(left.right,right.left) && comRoot(left.left,right.right);
  }
}
