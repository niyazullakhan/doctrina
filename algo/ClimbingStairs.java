package dp;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 * ===========================
 *
 * Solution:
 *    - The requirement to reach top of staircase.
 *    - To reach stair case one will have to reachh one step below or 2 step below. [As steps are either 1 or 2]
 *    - And similarly to read n-1 or n-2 step, one will have to read 1 or 2 step below each of that stair case.
 *    - hence dp[i] = dp[i-1] + dp[i-2].. dp[n] will give the number of ways to reach nth height
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        int staircase=10;
        int dp[] = new int[staircase+1];

        dp[0]=1; //default value

        for(int i=1; i<=staircase; i++) {
            if(i==1) {
                dp[i] = 1;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        System.out.println(dp[staircase]);

    }

}
