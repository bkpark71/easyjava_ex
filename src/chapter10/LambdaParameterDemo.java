package chapter10;

public class LambdaParameterDemo {
  public static void main(String[] args) {
    // 함수형 인터페이스를 매개변수로 사용하는 경우
    MyFunction f = (a,b) -> a > b ? a : b;
    myMethod(f);

    // 함수형 인터페이스를 리턴타입으로 사용하는 경우
    System.out.println(myFunction2().max(10,20));
    MyFunction myFunction = myFunction2();
    System.out.println(myFunction.max(10,20));
  }

  static void myMethod(MyFunction f){
    System.out.println(f.max(3,5));
  }

  static MyFunction myFunction2(){
    MyFunction f = (a,b) -> a > b? a : b;
    return f;
  }
}

