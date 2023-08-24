package chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();

    set.add(new Person("김열공",20));
    set.add(new Person("최고봉",56));
    set.add(new Person("우등생",16));
    set.add(new Person("나자바",35));

    // iterator를 이용해 원소 출력
    Iterator<Person> iterator = set.iterator();
    while(iterator.hasNext()){
      System.out.print(iterator.next() + " ");
    }
    System.out.println();

    System.out.println(new Person("나자바",35).hashCode());
    System.out.println(new Person("나자바",36).hashCode());
    // 동일한 객체 추가해보기,
    // hashset은 hashcode 값을 가지고 equals 을 비교
    set.add(new Person("나자바",36));
    // iterator를 이용해 원소 출력
    iterator = set.iterator();
    while(iterator.hasNext()){
      System.out.print(iterator.next() + " ");
    }
    System.out.println();
  }
}

class Person{
  // 필드
  String name;
  int age;
  // 생성자
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  // toString 메서드 오버라이딩
  @Override
  public String toString() {
    return "Person["+name+" : " + age + "]";
  }

  @Override
  public int hashCode() {
    return name.hashCode() + age;
  }
  @Override
  public boolean equals(Object obj) {
    if(obj != null && obj instanceof Person person){
      if(this.hashCode() == person.hashCode()){
        return true;
      }
    }
    return false;
  }
}