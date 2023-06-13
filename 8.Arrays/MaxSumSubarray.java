public class MaxSumSubarray {
    public static void SumOfSubarray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        // int sum = 0;
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++ ){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + numbers[k];
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("The Maximum Sum is: " + maxSum );
    }
    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        SumOfSubarray(numbers);
    }
}
