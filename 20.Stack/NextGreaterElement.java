import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreaterElement(int[] arr,int[] greaterElementArr,Stack<Integer> s){
        for(int i = greaterElementArr.length - 1 ;i >= 0; i--){
            //1.While
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2.if-else
            if(s.isEmpty()){
                greaterElementArr[i] = -1;
            } else {
                greaterElementArr[i] = arr[s.peek()];
            }
            //3.push in s
            s.push(i);
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        int[] arr = {6,8,0,1,3};
        int[] greaterElement = new int[arr.length];
        nextGreaterElement(arr, greaterElement, s);
        
        //printing the next greater element
        for(int i = 0; i < greaterElement.length; i++){
            System.out.print(greaterElement[i] + " ");
        }
    }
}
