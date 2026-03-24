public class AttendanceRecord {

    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(s);
        System.out.println(checkRecord(s));
    }

    public static boolean checkRecord(String s){
        int absentCount = 0;
        int consecutiveLate = 0;

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            // Check absent
            if(ch == 'A'){
                absentCount++;

                if(absentCount >= 2)
                    return false;
            }

            // Check late
            if(ch == 'L'){
                consecutiveLate++;

                if(consecutiveLate >= 3)
                    return false;
            } else {
                // reset if not L
                consecutiveLate = 0;
            }
        }

        return true;
    }
}
