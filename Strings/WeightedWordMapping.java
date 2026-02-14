package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class WeightedWordMapping {
    public static void main(String []args){
        String words[] = {"abcd","def","xyz"};
        int weights[] = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(easierWay(words, weights));
    }
    
    public static String easierWay(String words[], int weights[]){
        StringBuilder sb = new StringBuilder("");

        // for word
        for (String word : words) {
            int weight = 0;
            for(int j = 0;j<word.length();j++){
                weight+= weights[word.charAt(j)-'a'];
            }
            weight = weight % 26;
            char c = (char) ('a' + weight); // convert to alphabet
            char reversed = (char) ('z' - c + 'a'); // reverse aplhabet
            sb.append(reversed);
        }
        return sb.toString();
    }

    public static String mapWordWeights(String words[], int weights[]){
        StringBuilder sb = new StringBuilder("");

        // we make a hashmap first
        LinkedHashMap<Character,Integer> dict = new LinkedHashMap<>();
        Character c = 'a';
        // filling the hashmap
        for(int i = 0;i<weights.length;i++){
            dict.put(c, weights[i]);
            c++;
        }

        // first we have an array words
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : words) {

            int currWeight = 0;
            // we have each string

            for(int i = 0;i<s.length();i++){
                currWeight = currWeight + dict.get(s.charAt(i));
            }
            list.add(currWeight%26);

        }

        int currListSize = list.size();
        List<Map.Entry<Character,Integer>> entries = new ArrayList<>(dict.entrySet());
        Collections.reverse(entries);
        for(int i = 0;i<currListSize;i++){
            int curr = list.get(i);
            sb.append(entries.get(curr).getKey());
        }

        return sb.toString();
    }
}
