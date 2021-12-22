package com.xb.code.JZ50;

import java.util.HashMap;

/**
 * <p>todo</p>
 *
 * @Author xb
 * @Date 2021/12/21 13:29
 * @Version 1.0
 **/
public class Solution01 {
  public int FirstNotRepeatingChar(String str) {
    HashMap<Character,Boolean> map = new HashMap<>();
    char[] chars = str.toCharArray();
    // 遍历一遍数组，将元素只有一个map的value=ture， 否则value = false
    for (char c : chars) {
      if (map.containsKey(c)) {
        map.put(c,false);
      }else{
        map.put(c,true);
      }
    }
    // 重新遍历一遍数组，找到第一个只出现一次的元素。
    for (int i = 0; i < chars.length; i++) {
      if(map.get(chars[i])){
        return i;
      }
    }
    // 没有复合条件的返回-1
    return -1;
  }
}
