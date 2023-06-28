public class MultipleInheritance {
    public static void main(String args[]){
        Bear b1 = new Bear();
        b1.eatGrass();
        b1.eatMeat();
    }
}

interface Herbivore{
    void eatGrass();
}

interface Carnivore{
    void eatMeat();
}

class Bear implements Herbivore,Carnivore{
    public void eatGrass(){
        System.out.println("Beer is eating grass");
    }
    public void eatMeat(){
        System.out.println("Bear is eating meat");
    }
}