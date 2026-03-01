package Strings;
public class ToLower {
    public static void main(String[] args) {
        String s = "HeLlO";
        System.out.println(toLowerString(s));
    }

    public static String toLowerString(String s){
        StringBuilder sb = new StringBuilder("");
        
        // we have a method .toLowerCase() in java and it does the problem in 0 ms
        // now lets try from scratch

        // for loop
        for(int i = 0;i<s.length();i++){
            int ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                ch = ch + 32;
                sb.append((char)ch);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}