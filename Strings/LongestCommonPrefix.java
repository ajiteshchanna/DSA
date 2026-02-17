package Strings;
import java.util.*;

public class LongestCommonPrefix {
    public static void main(String args[]){
        String[] strs = {"cir","car"};
        System.out.println(efficientMethod(strs));
    }

    // this was the brute force method -> O(n*m) or O(n^2)
    public static String calculatingPrefix(String[] strs){
        String prefixLongest = strs[0]; // flower

        for(int i = 1;i<strs.length;i++){

            String currWord = strs[i];
            StringBuilder sb = new StringBuilder("");
            int lengthToBeConsidered = currWord.length();

            if(currWord.length()>prefixLongest.length()){
                lengthToBeConsidered = prefixLongest.length();
            }

            for(int j = 0;j<lengthToBeConsidered;j++){

                if(prefixLongest.charAt(j) == currWord.charAt(j)){
                    sb.append(prefixLongest.charAt(j));
                } else{
                    break;
                }

            }

            prefixLongest = sb.toString();
        }

        return prefixLongest;
    }


    // more efficient method
    public static String efficientMethod(String []strs){
        // sorting the words
        Arrays.sort(strs);

        // result vairable
        StringBuilder sb = new StringBuilder("");

        // comparing first and last
        for(int i = 0;i<strs[0].length();i++){

            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                sb.append(strs[0].charAt(i));
            } else {
                break;
            }

        }
        
        return sb.toString();
    }
}
