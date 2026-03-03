package Strings;
import java.util.*;

public class FindCommonCharacters{

    public static void fillCount(String word, int count[]){
        for(int i = 0;i<word.length();i++){
            count[word.charAt(i)-'a']++;
        }
    }
    public static void main(String args[]) {
        String []words = {"cook","lock","cool"};
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words){
        ArrayList<String> list = new ArrayList<>();
        int n = words.length;

        int count[] = new int[26];
        for(int i = 0;i<count.length;i++){
            count[i] = 0;
        }

        fillCount(words[0], count);

        for(int i = 1;i<words.length;i++){
            int temp[] = new int[26];
            for(int j = 0;j<26;j++){
                temp[j] = 0;
            }

            fillCount(words[i], temp);

            for(int j = 0;j<26;j++){
                count[j] = Math.min(count[j], temp[j]);
            }
        }

        for(int i = 0;i<26;i++){
            int c = count[i];
            while(c>0){
                list.add(Character.toString(i+'a'));
                c--;
            }
        }

        return list;
    }
}