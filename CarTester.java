class CarTester {
  //Tester or driver class
  public static void main(String[] args) {
    //While creating an object of a class, use the new keyword
    //converting a design into a real world object
      Car lambo = new Car(); //lambo are crv are objects
      Car crv = new Car(); // instantiating is the process of creating objects, objects are also known as instances

    //just using new - creates undesirable values like null,0
    //Using constructor will help us create desirable value
    System.out.println(lambo.type);
    System.out.println(lambo.brand);
    System.out.println(lambo.engineCapacity);
    System.out.println(lambo.isAutomatic);

    System.out.println(crv.type);
    System.out.println(crv.engineCapacity);
    System.out.println(crv.isAutomatic);

    Car ferrari = new Car("sedan","Ferrari",500000,true);
    Car santaFe = new Car("SUV","hyundai",1234, true);
    Car mustang = new Car("Mustang", 400000);
    Car challenger = new Car("SUV","Dodge",true);
    
    System.out.println("Ferrari Info");
    System.out.println(ferrari.brand);
    System.out.println(ferrari.engineCapacity);
    
    System.out.println("SantaFe Info");
    System.out.println(santaFe.brand);
    System.out.println(santaFe.engineCapacity);

     System.out.println("Mustang Info");
    System.out.println(mustang.brand);
    System.out.println(mustang.engineCapacity);

     System.out.println("Challenger Info");
    System.out.println(challenger.brand);
    System.out.println(challenger.type);
  }
}

