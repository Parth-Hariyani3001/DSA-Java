public class ReverseArray {
    public static void reverse(int numbers[]){
        int temp = 0;
        int first = 0;
        int last = numbers.length - 1;
        while(true){
            temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
            if(first == last || first > last){
                break; 
            }
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8};
        reverse(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        int numbers2[][] = {{1,2,3},{3,2,1}};
        for(int i = 0; i < numbers2.length; i++){
            for(int j = 0; j < numbers2[i].length; j++){
                System.out.print(numbers2[i][j]);
            }
            System.out.println();
        }
    }
}
