package Strings;

public class ReverseOnlyLetters {

    public static void printArr(String[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" , ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(s);
        String res = reverseLetters(s);
        System.out.println(res);
    }

    public static String reverseLetters(String s){
        // creating an array so that swapping will be inplace and O(1)
        String []arr = s.split("");

        // we will be using two pointer approach
        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            char a = s.charAt(i);
            char b = s.charAt(j);

            // using ascii values
            boolean aLetter = (a>=65 && a<=90) || (a>=97 && a<=122);
            boolean bLetter = (b>=65 && b<=90) || (b>=97 && b<=122);

            // only letter
            if(aLetter && bLetter){
                // swap
                arr[i] = Character.toString(b);
                arr[j] = Character.toString(a);

                // update pointers
                i++;
                j--;
            } else if(aLetter && !bLetter){
                // a letter but b not letter
                j--;
            } else if(bLetter && !aLetter){
                // b letter but a not letter
                i++;
            } else {
                // both not letter
                i++;
                j--;
            }
        }

        StringBuilder sb = new StringBuilder("");
        for (String arr1 : arr) {
            sb.append(arr1);
        }

        return sb.toString();
    }
}
