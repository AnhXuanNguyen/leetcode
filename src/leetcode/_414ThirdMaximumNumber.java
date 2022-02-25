package leetcode;

public class _414ThirdMaximumNumber {
    public static int thirdMax(int[] nums){
        long[] maxValue = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int val: nums){
            insert(val, maxValue);
        }
        if (maxValue[2] != Long.MIN_VALUE){
            return (int) maxValue[2];
        }
        return (int) maxValue[0];
    }

    private static void insert(int val, long[] maxValue) {
        int i = 0;
        while (i < maxValue.length){
            if (maxValue[i] == val){
                return;
            }
            if (maxValue[i] < val){
                break;
            }
            else {
                i++;
            }
        }
        if (i < maxValue.length){
            for (int j = maxValue.length-2; j >= i; j--){
                maxValue[j+1] = maxValue[j];
            }
            maxValue[i] = val;
        }
    }
    public static void main(String[] args) {
        int[] array = {2,2,3,5};
        System.out.println(thirdMax(array));
    }
}
