import java.util.*;

public class JavaProb3{
    public static void main(String args[]){
        float pencil = 5f;
        float pen = 15f;
        float eraser = 8f;

        float total = pencil + pen + eraser;
        System.out.println(total);

        //To implement GST
        float finalValue = total + (0.18f * total);
        System.out.println(finalValue);
    }
}