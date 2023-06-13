//import java.util.*; 

public class LargestNumber {
    public static int Largest(int numbers[]){
        int infy = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > infy ){
                infy = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
        return infy;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        int largestValue = Largest(numbers);
        System.out.println(largestValue);
    } 
}
