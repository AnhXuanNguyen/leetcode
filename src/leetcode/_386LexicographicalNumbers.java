package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _386LexicographicalNumbers {
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        List<String> listString = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            listString.add(String.valueOf(i));
        }
        Collections.sort(listString);
        for (String string: listString){
            result.add(Integer.parseInt(string));
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
