public class MethodOverloading{
    public static void main(String[] args){
        Calculator newCalc = new Calculator();
        System.out.println(newCalc.add(4,5));
        System.out.println(newCalc.add(4.5f,5.2f));
        System.out.println(newCalc.add(4,5,4));
    }
}

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    float add(float a, float b){
        return a + b; 
    }
    int add(int a,int b,int c){
        return a + b + c;
    }
}