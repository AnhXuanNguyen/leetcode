package leetcode;

import java.util.Arrays;

public class _912SortAnArray {
    public static int[] sortArray(int[] nums) {
        int[] result = mergeSort(nums, 0, nums.length-1);
        return result;
    }

    private static int[] mergeSort(int[] nums, int start, int end) {
        if (start > end){
            return new int[0];
        }
        if (start == end){
            int[] singleArray = {nums[start]};
            return singleArray;
        }
        int mid = (start + end)/2;
        int[] arr1 = mergeSort(nums, start, mid);
        int[] arr2 = mergeSort(nums, mid+1, end);
        int[] result = merge(arr1, arr2);
        return result;

    }
    public static int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n){
            if (i1 < arr1.length && i2 < arr2.length){
                if (arr1[i1] <= arr2[i2]){
                    result[i] = arr1[i1];
                    i++; i1++;
                }
                else {
                    result[i] = arr2[i2];
                    i++; i2++;
                }
            }
            else {
                if (i1 < arr1.length){
                    result[i] = arr1[i1];
                    i++; i1++;
                }
                else {
                    result[i] = arr2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(array)));
    }
}
