package StringProblem;/*
    *  Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words
    *  do not share common letters. You may assume that each word will contain only lower case letters.
    *  If no such two words exist, return 0.

    *  Example 1:
    *   Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
    *   Output: 16
    *   Explanation: The two words can be "abcw", "xtfn".

    *   Example 2:
    *   Input: ["a","ab","abc","d","cd","bcd","abcd"]
    *   Output: 4
    *   Explanation: The two words can be "ab", "cd".

    *   Example 3:
    *   Input: ["a","aa","aaa","aaaa"]
    *   Output: 0
    *   Explanation: No such pair of words.
    * */


public class MaximumProductOfWordLengths {
    public static int maxProduct(String[] words) {
        int maxValue=0;

        for(int index=0; index < words.length; index++) {
            boolean isCommon=true;
            int innIndex = index+1;
            int newLen=0;

            for(int counter = innIndex; counter < words.length;counter++) {
                for(char c : words[index].toCharArray()) {
                    if(!words[counter].contains(Character.toString(c))) {
                        isCommon=false;
                    } else {
                        isCommon=true;
                        break;
                    }
                }
                if(!isCommon) {
                    newLen = words[index].length() * words[counter].length();
                    maxValue = Math.max(newLen,maxValue);
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new String[] {"abcw","baz","foo","bar","xtfn","abcdef"}));
        System.out.println(maxProduct(new String[] {"a","ab","abc","d","cd","bcd","abcd"}));
        System.out.println(maxProduct(new String[] {"a","aa","aaa","aaaa"}));
    }
}