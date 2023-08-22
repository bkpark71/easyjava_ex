package chapter08;

public class StringBuilderDemo {
  public static void main(String[] args) {
    String s = new String("hi");
    System.out.println(s.hashCode());
    s = s + "!";
    System.out.println(s.hashCode());

    StringBuilder sb = new StringBuilder("hello, world");
    System.out.println(sb.hashCode());
    sb = sb.append("!");
    System.out.println(sb.hashCode());

    System.out.println("문자열의 길이 : " + sb.capacity());
    sb = sb.delete(7,12);
    System.out.println("world 삭제후 : " + sb);
    sb = sb.insert(7, "world");
    System.out.println("world 를 7번째 자리에 추가후 : " + sb);
    sb = sb.replace(7,12,"JAVA");
    System.out.println("world 를 JAVA로 변경 후 : " + sb);
    sb = sb.replace(0,6,"HELLO,").reverse();
    System.out.println("hello를 HELLO로 변경 후 리버스한 결과 : " + sb);
  }

}
