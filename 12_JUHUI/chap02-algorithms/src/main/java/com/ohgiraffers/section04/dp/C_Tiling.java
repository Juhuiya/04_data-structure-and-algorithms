package com.ohgiraffers.section04.dp;
//dp2문제, 수열로 풀면 됨.
public class C_Tiling {

    public static int solution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        // bottom-up 방식
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
