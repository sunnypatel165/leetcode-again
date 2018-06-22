/*
Problem Statement:
A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Problem Link:
    Self Dividing Numbers: https://leetcode.com/problems/subdomain-visit-count/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SubdomainVisitCounts.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> subdomainVisitCounts = new HashMap<>();
        List<String> answer = new ArrayList<>();
        for(int i=0;i<cpdomains.length;i++){
            String string[] = cpdomains[i].split(" ");

            int count = Integer.parseInt(string[0]);

            String domains[]= string[1].split("\\.");
            System.out.println(Arrays.toString(domains));

            if(domains.length ==1 )
                subdomainVisitCounts.put(domains[0], subdomainVisitCounts.getOrDefault(domains[0],0)+count);
            if(domains.length==2){
                subdomainVisitCounts.put(domains[1], subdomainVisitCounts.getOrDefault(domains[1],0)+count);
                subdomainVisitCounts.put(domains[0]+"."+domains[1], subdomainVisitCounts.getOrDefault(domains[0]+"."+domains[1],0)+count);
            }
            if(domains.length==3){
                subdomainVisitCounts.put(domains[2], subdomainVisitCounts.getOrDefault(domains[2],0)+count);
                subdomainVisitCounts.put(domains[1]+"."+domains[2], subdomainVisitCounts.getOrDefault(domains[1]+"."+domains[2],0)+count);
                subdomainVisitCounts.put(domains[0]+"."+domains[1]+"."+domains[2], subdomainVisitCounts.getOrDefault(domains[0]+"."+domains[1]+"."+domains[2],0)+count);
            }
        }
        for(Entry entry: subdomainVisitCounts.entrySet()){
            answer.add(entry.getValue() + " " + entry.getKey());
        }
        //answer = subdomainVisitCounts.entrySet().stream().map(entry -> entry.getValue()+" "+ entry.getKey()).collect(Collectors.toList());
        return answer;
    }
}
