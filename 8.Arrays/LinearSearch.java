public class LinearSearch {
    public static int LinerSearch(int numbers[],int key){
        int finalResult = -1;
        for(int i = 0; i < numbers.length; i++){
            if(key == numbers[i]){
                finalResult = i;
            } 
        }
        return finalResult;
    }
    
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;

        int index = LinerSearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }   else{
            System.out.println(index);
        }
    }
}
