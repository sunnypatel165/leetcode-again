/*
Problem Statement:
We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)
A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
Return a list of all uncommon words.
You may return the list in any order.

Problem Link:
    Uncommon Words from Two Sentences https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/UncommonWordsFromTwoSentences.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] wordsInA = A.split(" ");
        String[] wordsInB = B.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(String word: wordsInA){
            map.put(word, map.getOrDefault(word,0)+1);
        }for(String word: wordsInB){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        List<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()==1 )
                list.add(entry.getKey());
        }
        String answer[] = list.toArray(new String[list.size()]);
        return answer;
    }
}
