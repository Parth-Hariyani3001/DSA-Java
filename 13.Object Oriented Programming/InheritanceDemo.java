public class InheritanceDemo {
    public static void main(String[] args){
        Fish tuna = new Fish();
        tuna.eat();
    }    
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breadth(){
        System.out.println("Breadthing");
    }
}

//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swimming");
    }
}
