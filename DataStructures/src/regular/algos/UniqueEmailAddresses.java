package regular.algos;

import java.util.ArrayList;

public class UniqueEmailAddresses {

    public static void main(String[] args){

        String[] emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        System.out.println(numUniqueEmails(emails));


    }
    static int numUniqueEmails(String[] emails) {
        ArrayList<String> receivedEmails = new ArrayList<String>();

        for(String email : emails){
            StringBuilder tempEmail = new StringBuilder();
            int i = 0;
            boolean isDomain = false;

            while(i < email.length() && !isDomain){
                Character c = new Character(email.charAt(i));

                if(!c.equals('.')){
                    if(c.equals('+')){
                        while(!c.equals('@')){
                            i++;
                            c = email.charAt(i);
                        }
                        tempEmail.append(c);
                        isDomain = true;
                    }
                    else{
                        tempEmail.append(c);
                    }
                }
                i++;
            }

            while(i < email.length()){
                tempEmail.append(email.charAt(i));
                i++;
            }




//            System.out.println(tempEmail);
            if(receivedEmails.contains(tempEmail.toString())){
                System.out.println( "Email already there" );
            }else{
                System.out.println( "Email Not there" );
                receivedEmails.add(tempEmail.toString());
            }
        }
        System.out.println(receivedEmails);
        return receivedEmails.size();
    }
}

/*
Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?



Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails

 */