public class _1295_FindNumberswith {
    public static int findCountArray(int[] array) {
        int count = 0;
        for (int a: array){
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
        int[] array = {1,22,3,5567,234};
        System.out.println(findCountArray(array));
    }
}
