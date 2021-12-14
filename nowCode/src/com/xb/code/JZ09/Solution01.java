package com.xb.code.JZ09;

import java.util.Stack;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/14 13:24
 * @Version 1.0
 **/
public class Solution01 {
  Stack<Integer> stack1 = new Stack<Integer>();
  Stack<Integer> stack2 = new Stack<Integer>();

  /**
   * 压栈，先stack1中压入元素
   */
  public void push(int node) {
    stack1.push(node);
  }

  /**
   * 出栈，如果stack2不为空，弹出栈顶元素。如果stack2为空，把stack1的元素全部压入，在弹出栈顶元素
   */
  public int pop() {
    if (stack2.empty()) {
      while (!stack1.empty()) {
        stack2.push(stack1.peek());
        stack1.pop();
      }
    }
    int ret = stack2.peek();
    stack2.pop();
    return ret;
  }
}
