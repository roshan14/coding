/*
    * Write a function solution that returns a string of length N consisting of alternating characters: "+" and "-",
    *  starting with a "+" character. You can assume N is between 1 and 100.
    *
    * For example, given N = 5, your function should return "+-+-+" and given N = 4, it should return "+-+-".
 */


public class StringRepeat {

    public static String solution(int number) {
        // write your code in Java SE 8
        String finalStr = "";
        for (int counter = 0; counter < number; counter++){
            if (counter%2 == 0) {
                finalStr += "+";
            } else {
                finalStr += "-";
            }
        }
        return finalStr;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(4));
        System.out.println(solution(3));
        System.out.println(solution(0));
    }
}
