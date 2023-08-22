package chapter08;

public class ObjectMethodDemo {
  public static void main(String[] args) {
    Mouse mouse1 = new Mouse("Samsung");
    Mouse mouse2 = new Mouse("Samsung");
    System.out.println("mouse2 == mouse1 ? " + (mouse2 == mouse1));
    System.out.println("제조사가 같은가 ? " + mouse2.equals(mouse1));

    Keyboard keyboard1 = new Keyboard("Samsung");
    Keyboard keyboard2 = new Keyboard("Samsung");

    System.out.println("keyboard1 == keyboard2 ? " + (keyboard1 == keyboard2));
    System.out.println("제조사가 같은가 ? " + keyboard2.equals(keyboard1));
    System.out.println("제조사가 같은가 ? " + keyboard2.equals(mouse2));

    Class c = keyboard1.getClass();
    System.out.println(c.getName());
    System.out.println(c.getSimpleName());
    System.out.println(c.getTypeName());
    System.out.println(c.getPackage().getName());
  }
}

class Mouse {
  String name;

  public Mouse(String name){
    this.name = name;
  }

  @Override
  public String toString() {
    return "제조사가 " + name + "인 마우스입니다.";
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || this.getClass() != obj.getClass()) return false;
    //if(obj instanceof Mouse mouse){
    if (this.name.equalsIgnoreCase(((Mouse) obj).name)) {
      return true;
    }
    return false;
  }
}
class Keyboard {
  String name;

  public Keyboard(String name){
    this.name = name;
  }
  @Override
  public String toString() {
    return "제조사가 " + name + "인 키보드입니다.";
  }
   @Override
  public boolean equals(Object obj) {
    if(obj instanceof Keyboard keyboard){
      if(this.name.equalsIgnoreCase(keyboard.name)) {
        return true;
      }
    }
    return false;
  }
}
