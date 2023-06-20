//import java.util.*;
public class shortestPath {
    public static float displacement(String route){
        int x = 0;
        int y = 0;
        for(int i = 0; i < route.length(); i++){
            if(route.charAt(i) == 'N'){
                y++;
            } else if(route.charAt(i) == 'S'){
                y--;
            } else if(route.charAt(i) == 'E'){
                x++;
            } else if(route.charAt(i) == 'W'){
                x--;
            }
        }
        //AS the starting coordinates are (0,0)
        int XSquare = x*x;
        int YSquare = y*y;
        return (float)Math.sqrt(XSquare+YSquare);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.print(displacement(path));
    }
}
