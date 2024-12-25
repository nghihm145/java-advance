package J04Collections;

import java.util.Arrays;
import java.util.LinkedList;

/*
Write a Java method use LinkedList to convert the input array into new array that contains distinct adjacent elements.
Example:
For list = ["A", "B", "C", "C", "D"] the return list is ["A", B", "C", D"]
Input: an array of String inputArr  0 < inputArr.length < 100
Output: the array that contains distinct adjacent elements with value from inputArr
Execution time limit: 1 second
 */
public class Collections13 {
    static String[] distincAdjacent(String[] inputArr) {
        LinkedList<String> aList = new LinkedList<>();
        aList.addAll(Arrays.asList(inputArr));
        return aList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] inputArr = {"A", "B", "C", "C", "D"};
//        System.out.println(distincAdjacent(inputArr));
        String[] newArr = distincAdjacent(inputArr);
        for (String x : newArr){
            System.out.println(x);
        }
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
        }
        System.out.println("======");
        for (int i = 100; i >= 0; --i){
            System.out.println(i);
        }

    }
}
