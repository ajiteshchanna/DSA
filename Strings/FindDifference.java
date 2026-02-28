import java.util.Arrays;

public class FindDifference{

    public static void printArr(String s[]){
        for(int i = 0;i<s.length;i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();
        System.out.println("NEW LINE");
    }
    public static void main(String[] args) {
        String s = "ihwrdisrhgxwbfevrxbtzgsywhnzleueadikniwyuasflpsviobwvsmydmyzppqjlmzakpbnouyttdigkcdzypvcqxbttmblttehgjlnpjwpzoprntifysfatjboasottnkpyyvmdcafpjicfpgmbwqdsaxdmmdmupnwhkpxixpdwmczntqtushemvavofszomtsrafzmxctpidjadwcwggdbyliqmcvuwscryfsvlvfrhfphmxvcnytbctomicwdwjjmdhmcqtnlqgixxdyjydhwnftkobotbhsgykawhtvnkxoykwkgvtqioqoiilergxlpuujabiug";
        String t = "gyptmtjntxlusjhbzkbgowslthwtytdnflsyfsgfytzrodatykdyvgsmvxsuemijitvodmwrrqmcabhwzyoouorfckhisjpduoxvtmttzvwmicdxsovsabmpcpppzycuwbmpihmxadmvkkwerimhgwdwdtvqwbwtetppkpkbcaifuqbenagycdqatklciaczcpglxmvfaqnwpnssdmnhcmifeyndzttvypwlgpttvhswoiijybchbvzklgngqziyaczowgwiufqyhxxdqjrxolddgnmriijopdsikqwtyhplhubrljfjanexxyfvjmudxsomnfbafntpib";

        System.out.println(findAddedCharacter(s, t));

    }

    // optimized O(n) approach using bit operator (logical operator which is ^)
    public static char findDifference(String s, String t){
        /*
            Concept:
                a^a = 0
                a^0 = a

                let's take example:
                s = abcd
                t = abcde

                Let's dry run:
                result = 0

                firtst loop:
                    result = 0^a = a
                    result = a^b
                    result = a^b^c
                    result = a^b^c^d

                second loop:
                    result = a^b^c^d^a = a^a^b^c^d = 0^b^c^d = b^c^d
                    result = b^c^d^b = 0^c^d = c^d
                    result = c^d^c = 0^d = d
                    reesult = d^d = 0
                    result = 0^e = e
                
                    final result = e
        */
        char result = 0;

        for(char c: s.toCharArray()){
            result ^= c;
        }

        for(char c: t.toCharArray()){
            result ^=c;
        }

        return result;
    }

    public static char findAddedCharacter(String s, String t){
        // so we need to find the character that was added to s to form t\

        // special case
        if(s.length()==0){
            return t.charAt(0);
        }

        // creating string arrays by splitting
        String arr_s[] = s.split("");
        String arr_t[] = t.split("");

        // sorting both the arrays
        Arrays.sort(arr_s);
        Arrays.sort(arr_t);


        char ch = '0';

        // for loop to compare index by index
        for(int i = 0;i<arr_s.length;i++){

            if(!arr_s[i].equals(arr_t[i])){

                ch = arr_t[i].charAt(0);
                break;

            }

        }

        if(ch == '0'){

            ch = arr_t[arr_t.length-1].charAt(0);
            
        }


        return ch;
    } 
}