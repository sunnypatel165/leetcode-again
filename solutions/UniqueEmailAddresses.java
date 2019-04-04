/*
Problem Statement:
Every email consists of a local name and a domain name, separated by the @ sign.
For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
Besides lowercase letters, these emails may contain '.'s or '+'s.
If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
It is possible to use both of these rules at the same time.
Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 


Problem Link:
    Unique Email Addresses: https://leetcode.com/problems/unique-email-addresses/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/UniqueEmailAddresses.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int numUniqueEmails(String[] emails) {
        if(emails.length==0)
            return 0;
       Set<String> uniqueEmails = new HashSet<>();
        for(String email: emails){
            String beautified = beautifyEmail(email);
            if(beautified!=null & beautified.length()!=0)
            uniqueEmails.add(beautified);
        }
        return uniqueEmails.size();
    }
    public String beautifyEmail(String email){
        String beautified = "";
        String consideredPrefix = email.split("\\+")[0];
        consideredPrefix = consideredPrefix.replaceAll("\\.","");
        beautified = consideredPrefix;
        beautified += email.split("@")[1];
        return beautified;
    }
}
