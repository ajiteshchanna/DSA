package Strings;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FLaG"));
    }

    public static boolean detectCapitalUse(String word){
        /*
            Here, according to the rules given in the question:
                - All letters in this word are capitals, like "USA".
                - All letters in this word are not capitals, like "leetcode".
                - Only the first letter in this word is capital, like "Google".
        */

        // Case 1: All letters are uppercase
        if(word.equals(word.toUpperCase())){
            return true;
        } else if (word.equals(word.toLowerCase())){ // Case 2: All letters are lowercase
            return true;
        } else { // Case 3: MixedCase
            boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
            boolean othersLowerCase = word.substring(1).equals(word.substring(1).toLowerCase());

            if (isFirstCapital && othersLowerCase){
                return true;
            } else {
                return false;
            }
        }
    }
}
