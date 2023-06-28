public class HierarchicalInheritance {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.breadth();
        d1.bark();

        Fish f1 = new Fish();
        f1.breadth();
        f1.swims();
    }
}

class Animal{
    void breadth(){
        System.out.println("Breadth");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barks");
    }
}

class Fish extends Animal{
    void swims(){
        System.out.println("Swims");
    }
}
