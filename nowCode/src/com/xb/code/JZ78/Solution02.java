package com.xb.code.JZ78;

import com.xb.code.TreeNode;

import java.util.ArrayList;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/13 13:35
 * @Version 1.0
 **/
public class Solution02 {

  ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    if(pRoot == null){
      return list;
    }


    method(list, 1, pRoot);

    return list;
  }

  public void method(ArrayList<ArrayList<Integer>> list, int deep, TreeNode node){
    if (node ==null) {
      return;
    }
    if(deep>list.size()){
      list.add(new ArrayList<Integer>());
    }
    list.get(deep-1).add(node.val);
    method(list,deep+1,node.left);
    method(list,deep+1,node.right);
  }
}
