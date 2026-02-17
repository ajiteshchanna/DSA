package Strings;

import java.util.LinkedHashMap;

public class ExcelSheetColumn {
    public static void main(String[] args) {
        String columnTitle = "ABC";
        System.out.println(efficient(columnTitle));
    }

    // brute force (still a good) method [4ms Runtime]
    public static int columnNumber(String columnTitle){
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        Character ch = 'A';
        for(int i = 1;i<=26;i++){
            map.put(ch.toString(), i);
            ch++;
        }

        System.out.println(map);

        // single aplhabet column title
        if(columnTitle.length() == 1){
            return map.get(columnTitle);
        } else {
            int res = 0;
            for(int i = 0;i<columnTitle.length();i++){
                Character c = columnTitle.charAt(i);
                res =  res*(26) + map.get(c.toString());
            }

            return res;
        }
    }

    // a more efficient method: here we are not using any map, so [1ms Runtime]
    public static int efficient(String columnTitle){
        int ans = 0;
        for(int i = 0;i<columnTitle.length();i++){
            Character c = columnTitle.charAt(i);
            System.out.println("c: " + c);
            int ascii = c;
            System.out.println("ascii: " + ascii);
            ans = ans*(26) + (ascii-64);
        }

        return ans;
    }
}
