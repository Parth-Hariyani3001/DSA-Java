import java.util.*;

public class PassFail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();

        boolean PassFail = marks > 33 ? true : false;

        if(PassFail){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        sc.close();
    }
}
