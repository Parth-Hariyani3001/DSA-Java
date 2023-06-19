import java.util.Arrays;
import java.util.Collections;
public class InBuiltSort {
    public static void printArray(int nums[]){
        for(int i = 0;i < nums.length; i++ ){
            System.out.print(nums[i] + " ");
        }
    }
    public static void printArray(Integer nums[]){
        for(int i = 0;i < nums.length; i++ ){
            System.out.print(nums[i] + " ");
            
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        Integer arr2[] = {5,4,1,3,2};
        Arrays.sort(arr2,Collections.reverseOrder());
        Arrays.sort(arr);
        printArray(arr);
        printArray(arr2);
    }
}
