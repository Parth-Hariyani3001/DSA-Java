public class ClassesObjects {
    public static void main(String[] args){
        //Pen object
        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setTip(5);
        p1.color = "Yellow";
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem,int math){
        percentage = (phy + chem + math) /3;
    }
}

