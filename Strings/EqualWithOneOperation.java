public class EqualWithOneOperation{
    public static void main(String[] args) {
        String s1 = "vxqp";
        String s2 = "xpvq";
        System.out.println(canBeEqual(s1,s2));
    }

    public static boolean canBeEqual(String s1, String s2) {
        // Compare even indexed characters
        char[] even1 = {s1.charAt(0), s1.charAt(2)};
        char[] even2 = {s2.charAt(0), s2.charAt(2)};

        // Compare odd indexed characters
        char[] odd1 = {s1.charAt(1), s1.charAt(3)};
        char[] odd2 = {s2.charAt(1), s2.charAt(3)};

        // Sort both groups
        java.util.Arrays.sort(even1);
        java.util.Arrays.sort(even2);
        java.util.Arrays.sort(odd1);
        java.util.Arrays.sort(odd2);

        // Check if both groups match
        return java.util.Arrays.equals(even1, even2) &&
               java.util.Arrays.equals(odd1, odd2);
    }

}