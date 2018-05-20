/*
Problem Statement:
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
Return the number of different transformations among all words we have.

Problem Link:
    Unique Morse Code Words: https://leetcode.com/problems/unique-morse-code-words/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/UniqueMorseCodeWords.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {

    private final String MORSE_MAPPING[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    /**
     * [convertToMorse Converts the given string into it Morse represetation]
     * @param  s [String to be converted]
     * @return   [Morse representation]
     */
    private String convertToMorse(String s){
        StringBuilder builder = new StringBuilder();
        for(int i =0;i<s.length();i++)
            builder.append(MORSE_MAPPING[s.charAt(i)-'a']);
        return builder.toString();
    }

    /**
     * [uniqueMorseRepresentations returns the number of unique Morse Strings]
     * @param  words [List of words to count the unique Morse on]
     * @return       [Number of unique Morse words]
     */
    public int uniqueMorseRepresentations(String[] words) {

        Set<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++)
            set.add(convertToMorse(words[i]));
        return set.size();

    }
}
