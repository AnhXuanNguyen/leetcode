package leetcode;

public class _27_RemoveElement {
    public static int removeElement2(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n;){
            if (nums[i] == val){
                for (int j = i; j < n-1; j++){
                    nums[j] = nums[j+1];
                }
                n--;
            }
            else {
                i++;
            }
        }
        return n;
    }
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] array = {3,2,2,3};
        int n = removeElement(array, 3);
        System.out.println(n);
    }
}
