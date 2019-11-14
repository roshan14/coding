package minimumAbsoluteDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> numbers = null;
        if(arr.length >= 2 ) {
            Arrays.sort(arr);
            int lowestDiff = arr[1]-arr[0];
            list.add(getList(arr[0],arr[1]));
            for (int index = 1; index < arr.length-1; index++) {
                if(arr[index+1]-arr[index] == lowestDiff) {
                    list.add(getList(arr[index],arr[index+1]));
                } else {
                    break;
                }
            }
        }
        return list;
    }

    public List<Integer>getList(int first, int second ) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(first);
        list.add(second);
        return list;
    }

    public static void main(String[] args) {

    }
}
