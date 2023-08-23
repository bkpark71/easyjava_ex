package chapter08;
import java.util.Date;
public class SystemDemo {
  public static void main(String[] args) {
    int[] numbers = new int[1000];
    System.out.println(System.nanoTime());
    for (int i = 0; i < numbers.length ; i++) {
      numbers[i] = i+1;
    }
    System.out.println(System.currentTimeMillis());
    System.out.println(new Date(1692751568736L));
  }
}
