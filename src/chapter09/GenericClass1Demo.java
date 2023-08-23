package chapter09;

import java.util.ArrayList;

public class GenericClass1Demo {
  public static void main(String[] args) {
    ArrayList<Boricha> arrayListBoricha = new ArrayList<>();
    arrayListBoricha.add(new Boricha());
    //arrayListBoricha.add(new Beer());
    ArrayList<Beer> arrayListBeer = new ArrayList<>();
    arrayListBeer.add(new Beer());
    //arrayListBeer.add(new Boricha())

    Cup c = new Cup();
    c.setBeverage(new Boricha());
    if(c.getBeverage() instanceof Boricha){
      Boricha boricha = (Boricha) c.getBeverage();
    } else if (c.getBeverage() instanceof Beer){
      Beer beer= (Beer) c.getBeverage();
    }

    c.setBeverage(new Beer());
    Beer beer= (Beer) c.getBeverage();
    c.setBeverage(new Beverage());
    c.setBeverage(new Object());
    beer= (Beer) c.getBeverage();


  }
}
class Beverage {}
class Boricha extends Beverage{}
class Beer extends Beverage{}
class Cup {
  private Object beverage;
  public Object getBeverage() {
    return beverage;
  }
  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }
}
