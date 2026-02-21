public class AddStrings {

    public static void main(String args[]){
        System.out.println("Hello");
        String num1 = "139";
        String num2 = "11";
        System.out.println(addStrings(num1, num2));
    }

    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<str.length();i++){
            sb.append(str.charAt(i));
        }

        return sb.reverse().toString();
    }

    public static String addStrings(String num1, String num2){

    int i = num1.length() - 1;
    int j = num2.length() - 1;
    int carry = 0;

    StringBuilder sb = new StringBuilder();

    while(i >= 0 || j >= 0 || carry > 0){

        int d1 = 0;
        int d2 = 0;

        if(i >= 0){
            d1 = num1.charAt(i) - '0';
        }

        if(j >= 0){
            d2 = num2.charAt(j) - '0';
        }

        int sum = d1 + d2 + carry;

        sb.append(sum % 10);   // last digit
        carry = sum / 10;     // new carry

        i--;
        j--;
    }

    return sb.reverse().toString();
}

}
