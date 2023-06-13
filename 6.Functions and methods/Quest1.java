public class Quest1 {
    public static float calcAverage(float a, float b, float c){
        float Average = (a + b + c)/3;
        return Average;
    }
    public static void main(String args[]){
        float a = 3f, b = 2f, c = 6f;
        float average = calcAverage(a,b,c);
        System.out.println("The Average of Three Numbers is : " + average);
    }
}
