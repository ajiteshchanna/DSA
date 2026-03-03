import java.util.*;

public class FindCommonCharacters {

    // Function to count frequency of characters in a word
    public static void fillCount(String word, int[] count) {
        for (int i = 0; i < word.length(); i++) {
            // Increment frequency of current character
            count[word.charAt(i) - 'a']++;
        }
    }

    public static List<String> commonChars(String[] words) {

        List<String> result = new ArrayList<>();

        // Frequency array for storing minimum common frequency
        int[] count = new int[26];

        // Step 1: Initialize frequency using first word
        fillCount(words[0], count);

        // Step 2: Compare with remaining words
        for (int i = 1; i < words.length; i++) {

            // Temporary frequency array for current word
            int[] temp = new int[26];

            // Count frequency of current word
            fillCount(words[i], temp);

            // Update main count array with minimum frequency
            // This keeps only common characters
            for (int j = 0; j < 26; j++) {
                count[j] = Math.min(count[j], temp[j]);
            }
        }

        // Step 3: Build result from final frequency array
        for (int i = 0; i < 26; i++) {

            // Add character i ('a' + i) count[i] times
            while (count[i] > 0) {
                result.add(Character.toString((char) (i + 'a')));
                count[i]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"cook", "lock", "cool"};
        System.out.println(commonChars(words));
    }
}