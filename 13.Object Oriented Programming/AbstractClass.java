public class AbstractClass {
    public static void main(String args[]){
        Horse h1 = new Horse();
        System.out.println(h1.color); //brown;
        h1.walk();
        h1.changeColor();
        System.out.println(h1.color);   //dark brown

        Chicken c1 = new Chicken();
        c1.walk();
    }
}

//Abstract class 
abstract class Animal{
    String color;

    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("Animal eats");
    }

    //Abstract Method 
    abstract void walk();
}

class Horse extends Animal{
    //we need to compulsory implement the abstracted method of Animal
    void walk(){
        System.out.println("Walks on 4 legs");
    }

    void changeColor(){
        color = "dark brown";
    }
}

class Chicken extends Animal{
    //we need to compulsory implement the abstracted method of Animal
    void walk(){
        System.out.println("Walks on 2 legs");
    }

    void changeColor(){
        color = "red";
    }
}