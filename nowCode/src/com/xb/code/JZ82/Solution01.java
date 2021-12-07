package com.xb.code.JZ82;

import com.xb.code.TreeNode;

/**
 * @ClassName Solution01
 * @Description TODO
 * @Author xb
 * @Date 2021/12/7 9:22
 * @Version 1.0
 **/
public class Solution01 {


  public boolean hasPathSum(TreeNode root,int sum){
    if (root==null) {
      return false;
    }
    // 深度优先遍历
    return dfs(root,sum);
  }

  /**
   * 递归函数
   * @param curNode 当前节点
   * @param target 目标值
   * @return true 找到，false找不到
   */
  private boolean dfs(TreeNode curNode,int target){
    // 目标路径不存在，开始回溯
    if (curNode==null) {
      return false;
    }
    // 更新目标值
    target-= curNode.val;
    // 当前节点为叶子节点并且目标路径存在时，返回true
    if (curNode.left == null && curNode.right == null && target == 0) {
      return true;
    }
    // 对左右分支进行dfs
    return dfs(curNode.left,target) || dfs(curNode.right,target);

  }
}
