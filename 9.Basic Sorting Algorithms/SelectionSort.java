public class SelectionSort{
    public static void selectionSort(int nums[]){
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            int minPos = i; 
            for(int j = i+1; j < n; j++){
                if(nums[minPos] > nums[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }   
    public static void printArray(int nums[]){
        for(int i = 0;i < nums.length; i++ ){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String args[]){
        int nums[] = {5,4,1,3,2};
        selectionSort(nums);
        printArray(nums);
    }
}