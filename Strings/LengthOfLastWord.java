package Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWordCalc(s));
    }

    public static int lengthOfLastWordCalc(String s){
        // split the string in arrays of words
        String arr[] = s.trim().split(" ");
        return arr[arr.length-1].length();
    }
}
