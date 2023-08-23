package chapter08;

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person("111111", "홍길동");
    Person p2 = new Person("111111", "손흥민");

    if(p1.equals(p2))
      System.out.println("같은 사람이다.");
    else
      System.out.println("다른 사람이다.");
  }
}

class Person {
  //멤버필드
  String juminNo;
  String name;
  //생성자
  public Person(String juminNo, String name){
    this.juminNo = juminNo;
    this.name = name;
  }
  //메서드
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Person person){
      if(person != null && this.juminNo.equals(person.juminNo))
        return true;
    }
    return false;
  }
}