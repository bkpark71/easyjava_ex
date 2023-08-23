package chapter09;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
    ArrayList nums = new ArrayList();
    nums.add(10); // Integer로 10 이 auto-boxing 됨
    nums.add(3.14); // Double 로 3.14 가 auto-boxing 됨
    nums.add("hello");

    for (int i = 0; i < nums.size(); i++) {
      if(nums.get(i) instanceof Integer)
        System.out.println((Integer)(nums.get(i)) * 2);
      else if (nums.get(i) instanceof Double)
        System.out.println((Double)(nums.get(i)) * 2);
      else System.out.println("숫자 타입이 아닙니다.");
    }
  }
}
