package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _448FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            nums[Math.abs(nums[i]) - 1] = nums[nums[i] - 1] * -1;
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        List<Integer> result = findDisappearedNumbers(nums);
        for (Integer num : result){
            System.out.println(num);
        }
    }
}
