public class SuperKeyword {
    public static void main(String args[]){
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
    
}
