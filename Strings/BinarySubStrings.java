// package Strings;

public class BinarySubStrings{
    public static void main(String[] args) {
        String s = "00110011";
        System.out.println(countBinarySubstrings(s));
    }

    public static int countBinarySubstrings(String s){
        /*
            We count consecutive groups of 0s and 1s and sum the minimum of adjacent groups.
        */
        int result = 0; // final result variable

        int prev = 0; // previous group length
        int curr = 1; // current group length

        for(int i = 1;i<s.length();i++){
            // if same character, increase current group
            if(s.charAt(i) == s.charAt(i-1)){
                curr++;
            } else { 
            // if different character, means we are at boundary
            //
                result += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        result += Math.min(prev, curr);
        return result;
    }
}