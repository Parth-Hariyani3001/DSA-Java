import java.util.*;

public class MultipleOf10Continue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the value : ");
            int i = sc.nextInt();
            if(i % 10 == 0){
                continue;
            }
            System.out.println(i);
        } while(true);
    }   

}
