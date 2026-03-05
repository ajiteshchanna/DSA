
import java.util.HashSet;

public class UniqueEmails{
    public static void main(String args[]){
        // String emails[] = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String emails[] = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String emails[]){
        // set for storing the unique email address
        HashSet<String> set = new HashSet<>();
 
        for(int i = 0;i<emails.length;i++){
            // store the string
            String str = emails[i];

            // split at @ to get domain name and local name seperated
            String local_name = str.split("@")[0];
            String domain_name = str.split("@")[1];

            // work on the local_name part 
            // splitting by + to ignore the string after +
            // replacing all . with "" to ignore the .
            local_name = local_name.split("\\+")[0].replaceAll("\\.","");

            // joining the email back
            str = local_name + "@" + domain_name;

            // adding to set
            set.add(str);
        }


        return set.size();
    }
}