package leetcode;

public class _746MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] money = new int[cost.length+1];
        money[0] = 0;
        money[1] = 0;
        for (int i = 2; i < cost.length+1; i++){
            if ((money[i-1] + cost[i-1]) < (money[i-2] + cost[i-2])){
                money[i] = money[i-1] + cost[i-1];
            }
            else {
                money[i] = money[i -2] + cost[i-2];
            }
        }
        return money[cost.length];
    }

    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }
}
