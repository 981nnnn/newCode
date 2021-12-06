package com.xb.code;

import java.util.HashSet;

/**
 * @ClassName JZ76_Solution
 * @Description TODO
 * @Author xb
 * @Date 2021/11/25 22:51
 * @Version 1.0
 **/
public class JZ76_Solution {

 public static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


  public static ListNode deleteDuplication(ListNode pHead) {
    if(pHead == null){
      return null;
    }
    HashSet<Integer> set =  new HashSet<>();

    ListNode pre = pHead;

    ListNode cur = pHead.next;


    while(cur!=null){
      if(cur.val == pre.val){
        set.add(cur.val);
      }
      pre = cur;
      cur = cur.next;
    }
    // 根据相同节点删除
    // 删除头部
    while(pHead != null &&set.contains(pHead.val)){
      pHead = pHead.next;
    }
    if(pHead == null){
      return null;
    }
    // 再删除中间节点
    pre = pHead;
    cur = pHead.next;
    while(cur!=null){
      if(set.contains(cur.val)){
        pre.next = cur.next;
        cur = cur.next;
      }else{
        pre = cur;
        cur = cur.next;
      }
    }
    System.out.println(pHead);
    return pHead;

  }

  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next= new ListNode(2);
    node.next = new ListNode(3);
    node.next = new ListNode(3);
    node.next = new ListNode(4);
    node.next = new ListNode(4);
    node.next = new ListNode(5);
    deleteDuplication(node);

  }
}
