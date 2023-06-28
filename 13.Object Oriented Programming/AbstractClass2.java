public class AbstractClass2 {
    public static void main(String[] args){
        Mustang mg = new Mustang();
        mg.eat();
    }
}

//abstract class
abstract class Animal{
    Animal(){
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor is called");
    }
    void eat(){
        System.out.println("Mustang eats");
    }
}
