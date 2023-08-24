package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScoreExample {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scoreArray = new ArrayList<>();
    int score = 0;
    while(true){
      System.out.println("학생의 점수를 입력하세요. (종료하려면 -1 입력) : ");
      score = in.nextInt();
      if(score < 0) {
        // 학생의 정보 출력
        break;
      }
      // 학생의 정보 추가
    }
  }

  static void printScore(){
    // 학생의 정보 출력
  }
}
