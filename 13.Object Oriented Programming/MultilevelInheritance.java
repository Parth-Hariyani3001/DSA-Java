public class MultilevelInheritance {
    public static void main(String[] args){
        Dog molly = new Dog();
        molly.eat();
        molly.drink();
        molly.bark();
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal{
    public void drink(){
        System.out.println("Mammal is Drinking");
    }
}

class Dog extends Mammal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
