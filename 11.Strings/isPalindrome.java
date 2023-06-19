public class isPalindrome {
    public static boolean checkPali(String car){
        for(int i = 0; i < (car.length())/2; i++){
            if(car.charAt(i) != car.charAt(car.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
    String car = "racecar";   
    System.out.print(checkPali(car));     
    }
}

