import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord{
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String banned[] = {"hit"};
        String res = mostCommonUnbanned(paragraph, banned);
        System.out.println(res);
    }

    public static String mostCommonUnbanned(String paragraph, String []banned){

        // Convert paragraph to lowercase + remove punctuation
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        // Store banned words in HashSet
        // convert array into List, then that List into a set
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Map to store key (word) and value (frequency)
        Map<String, Integer> map = new HashMap<>();

        // Split paragraph into words
        String[] words = paragraph.split("\\s+"); // this is regex which means one or more spaces, just split

        String result = "";
        int max = 0;

        for(String word : words){

            // ignore banned word
            if(bannedSet.contains(word))
            continue;

            // filling hashmap
            map.put(word, map.getOrDefault(word,0) + 1);

            // Update most frequent word
            if(map.get(word) > max){
                max = map.get(word);
                result = word;
            }
        }

        return result;
    }
}