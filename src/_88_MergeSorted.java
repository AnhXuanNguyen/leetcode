public class _88_MergeSorted {
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int ai: nums2){
            insertElement(ai, nums1, m);
            m++;
        }
    }

    private static void insertElement(int ai, int[] nums1, int m) {
        boolean isSearch = true;
        for (int i = 0; i < m; i++){
            if (nums1[i] > ai){
                isSearch = false;
                for (int j = m-1; j >= i; j--){
                    nums1[j+1] = nums1[j];
                }
                nums1[i] = ai;
                break;
            }
        }
        if (isSearch){
            nums1[m] = ai;
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = ( m + n ) - 1;
        while (k >= 0){
            if (i < 0){
                nums1[k] = nums2[j];
                j--;
            }
            else if (j < 0){
                nums1[k] = nums1[i];
                i--;
            }
            else if (nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0, 0, 0};
        int[] nums2 = {1,2,4};
        merge(nums1, 3, nums2, 3);
        for (int ai: nums1){
            System.out.println(ai);
        }
    }
}
