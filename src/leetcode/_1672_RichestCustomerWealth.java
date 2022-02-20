package leetcode;

public class _1672_RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++){
            int check = 0;
            for (int a: accounts[i]){
                check += a;
            }
            if (check > max){
                max = check;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,4}, {3,2,1}};
        int max = maximumWealth(accounts);
        System.out.println(max);
    }
}
