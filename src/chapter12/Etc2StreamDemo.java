package chapter12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Etc2StreamDemo {
  public static void main(String[] args) {
    IntStream iterate = IntStream.iterate(1, x -> x + 2);
    //iterate.forEach(System.out::println);
    IntStream ints = new Random().ints(0, 10);
    //ints.forEach(System.out::println);
    Stream<Double> generate = Stream.generate(Math::random);
    //generate.forEach(System.out::println);
    IntStream range = IntStream.range(1, 5);
    range.forEach(System.out::println);
    IntStream rangeClosed = IntStream.rangeClosed(1, 5);
    rangeClosed.forEach(System.out::println);
  }
}
