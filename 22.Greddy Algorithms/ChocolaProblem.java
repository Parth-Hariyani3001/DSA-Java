import java.util.*;

public class ChocolaProblem {
    public static void main(String args[]){
        // int n = 4;
        // int m = 6;

        Integer costVer[] = {2, 1, 3, 1, 4}; //m-1
        Integer costHor[] = {4, 1, 2}; //n-1

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h = 0; //To track horizontal pointer
        int v = 0; //To track vertical pointer

        int hp = 1; //Horizontal pieces
        int vp = 1; //Vertical pieces

        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]){ //Horizontal cut 
                cost += (costHor[h] * vp);//jitne vertical pieces huve uske through horizontal cut
                hp++;
                h++;
            } else { //Vertical cut
                cost += (costVer[v] * hp);//jitne horizontal pieces huve uske through vertical cut
                vp++;
                v++;
            }
        }

        //For remaining pieces
        while(h < costHor.length){
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum number of cuts : " + cost);
    }
}
