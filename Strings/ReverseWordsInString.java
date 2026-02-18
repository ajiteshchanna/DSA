package Strings;

public class ReverseWordsInString {
    public static void main(String args[]){
        String soh = "Nazon Andaaz Se Kehte Hai Ki Jeena Hoga";
        System.out.println(efficientMethod(soh));

    }

    // brute force solution [O(n*m) & 18ms runtime]
    public static String reverseWords(String s){
        // split
        String arr[] = s.split(" ");

        // create new String
        String res = "";

        // traverse in string array
        for (String arr1 : arr) {
            StringBuilder sb = new StringBuilder("");
            // reverse each word
            for (int j = arr1.length() - 1; j>=0; j--) {
                sb.append(arr1.charAt(j));
            }
            // add element in that string
            res+=sb.toString() + " ";
        }

        // return string
        return res;
    }

    // efficient method [10ms]
    public static String efficientMethod(String s){
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == ' '){
                res.append(sb.reverse()).append(" ");
                sb.setLength(0);
            } else {
                sb.append(s.charAt(i));
            }
        }

        // add last word
        res.append(sb.reverse());

        return res.toString();
    }
}
