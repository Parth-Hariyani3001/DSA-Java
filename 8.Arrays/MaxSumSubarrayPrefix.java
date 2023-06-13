public class MaxSumSubarrayPrefix {
    public static void printMaxSubarray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //To Calculate the prefix array
        for(int i = 1; i < numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length ; j++){
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The Maximum Sum is : " + maxSum);

    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printMaxSubarray(numbers);
    }
}
