import java.util.*;

public class MaxLengthChain {
    public static void main(String args[]){
        int pairs[][] = {{5,4},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        int chainLength = 1;
        int lastPairEndNum = pairs[0][1]; //last seelcted pair end or chain end

        for(int i = 1;i < pairs.length; i++){
            if(pairs[i][0] > lastPairEndNum){
                chainLength++;
                lastPairEndNum = pairs[i][1];
            }
        }

        System.out.println("Maximum length of chain : " + chainLength);

    }
}
