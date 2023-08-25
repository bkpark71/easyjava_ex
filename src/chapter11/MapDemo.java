package chapter11;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapDemo {
  public static void main(String[] args) {
    Map<String,Integer> fruits = Map.of("사과", 5, "바나나", 3, "딸기", 10, "배", 1);
    System.out.println(fruits);
    System.out.println(fruits.size() + "종류의 과일이 있습니다.");

    //fruits.put("키위",100); immutable 이므로 수정 , 추가 불가
    //fruits.remove("사과");
    //fruits.clear();

    System.out.println("사과는 "+ fruits.get("사과") + "개 있습니다.");

    Set<String> keys = fruits.keySet();
    System.out.println(keys);
    for (String key : keys) {
      System.out.println(key);
    }
    Collection<Integer> values = fruits.values();
    System.out.println(values);
  }
}
