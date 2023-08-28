package chapter12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {
  public static void main(String[] args) {
    boolean b = Stream.of("a1", "b1", "c1").anyMatch(x -> x.startsWith("c"));
    System.out.println(b);

    boolean b1 = IntStream.of(1, 3, 5, 7, 9).allMatch(n -> n % 2 == 1);
    System.out.println(b1);
    // 스트림 사용X, 배열,for,if 문으로 전부 홀수인지 증명하는 프로그램 작성
    int[] ia = {1,3,5,7,9};
    boolean odd = true;
    for (int i : ia) {
      if(i % 2 != 1) {
        odd = false;
        break;
      }
    }
    System.out.println(odd);

    boolean b2 = IntStream.of(1, 3, 5, 7, 9).noneMatch(n -> n % 2 == 0);
    System.out.println(b2);

    // 모든 국가의 인구가 1억이 넘는지 아닌지를 출력해라. (match를 이용해서)
    boolean b3 = Nation.nations.stream()
        .allMatch(x -> x.getPopulation() > 100);
    if(b3) {
      System.out.println("모든 국가의 인구가 1억이 넘습니다.");
    } else {
      System.out.println("모든 국가의 인구가 1억이 넘는 것은 아닙니다.");
    }
  }
}
