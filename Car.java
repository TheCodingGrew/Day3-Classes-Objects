// First row of a excel sheet
// A design like a house design/house plan is a class
// whereas your actual house is an object 
// A class is a design that every object follows
public class Car{ //class declaration
  String type;
  String brand;
  int engineCapacity;
  boolean isAutomatic;
  

  //Every class's constructor should be within the same class
  //public, private  is a visibility modifier/access modifier
  //Constructor helps us in creating a new object with default values
  public Car(){ //constructor declaration
    //default constructor 
    //gives the same value to all the objects
    type="undefined";
    brand="unnamed";
    engineCapacity=200;
    isAutomatic=true;
  }
//Car ferrari = new Car("sedan","ford",500000,true);
//Car santaFe = new Car("SUV","hyundai",1234, true);
  
  public Car(String t, String b, int e, boolean auto){
    //Level 2 - constructor - helps us in creating customizable objects
    type=t;
    brand=b;
    engineCapacity=e;
    isAutomatic=auto;
  }

  //Level 1.5 constructor 
  public Car(String x, int y){
    brand = x;
    engineCapacity = y;
    type="Undefined";
    isAutomatic=true;
  }

  //Level 1.5 constructor
  public Car(String a, String b, boolean c){
    type=a;
    brand=b;
    isAutomatic=c;
  }  
  
}