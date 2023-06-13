public class StringLinearSearch {
    public static int stringLinearSearch(String menu[],String key){
        int finalResult = -1;
        for(int i = 0; i < menu.length; i++){
            if(key == menu[i]){
                finalResult = i;
            }
        }
        return finalResult;
    }
    public static void main(String args[]){
        String menu[] = {"dosa","samosa","bhel","panipuri"};
        String key = "bhel";

        int index = stringLinearSearch(menu,key);

        if(index == -1){
            System.out.println("Food not found");
        }   else {
            System.out.println(index);
        }
    }
}
