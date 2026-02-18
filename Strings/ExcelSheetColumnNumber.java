package Strings;

public class ExcelSheetColumnNumber {
    public static void main(String args[]){
        System.out.println(getColumnTitle(701));
    }

    public static String getColumnTitle(int columnNumber){
        // here the base is 26 and numbers are from 1 to 26 alloted to each single alphabet.
        StringBuilder sb = new StringBuilder("");

        while(columnNumber>0){
            // Here we have done (columnNumber-1) and not columnNumber directly because Excel indexing starts from 1, 
            // but programming modulo works from 0.
            // we store the remainder: which gives value from 0 to 25
            int remainder = (columnNumber-1)%26;

            // base alphabet is 'A' with ascii 65, so adding remainder in it gives current alphabet required
            sb.append((char)(remainder+'A'));
            /*
                Now here, the logic is just like Decimal → Binary conversion: which is divide by base.
                Here the base is 26.
                And we are subtracting 1 because computer works on modulo 1. (its a rule here)
                So, in short it is like base conversion to string. 
            */
            columnNumber = (columnNumber-1)/26;
        }

        // Why to reverse? You generate letters from right to left. we want from left to right.
        return sb.reverse().toString();
    }

}
