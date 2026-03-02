package Strings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class UncommonWords{
    public static void printArr(String[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" , ");
        }
        System.out.println();
    }
    public static void main(String []args){
        String s1 = "this apple is sweet"; 
        String s2 = "this apple is sour";

        String res[] = findUncommonWords(s1, s2);
        for(int i = 0;i<res.length;i++){
            System.out.println(res[i] + " ");
        }
    }

    public static String[] findUncommonWords(String s1, String s2){
        // creating arrays for better traversals
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");

        // an ordered hashmap to store string,freuency in pair
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // filling map
        for(String str:arr1){
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            } else {
                map.put(str, 1);
            }
        }

        for(String str:arr2){
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            } else {
                map.put(str, 1);
            }
        }

        // list to store the uncommon (unique) words
        ArrayList<String> list = new ArrayList<>();

        // finding the unique words
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // if freq == 1, then its unique
            if(value == 1){
                list.add(key);
            }
        }

        String res[] = new String[list.size()];
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }

        return res;
    }
}