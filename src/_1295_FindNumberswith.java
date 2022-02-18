public class _1295_FindNumberswith {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int a: nums){
            if (caculatorOf(a) %2 == 0){
                count++;
            }
        }
        return count;
    }

    private static int caculatorOf(int a) {
        int count = 0;
        int result = a;
        while (result != 0){
            result = result/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,51};
        System.out.println(findNumbers(nums));
    }
}
