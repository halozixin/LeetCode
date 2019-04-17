package com.zh.study.april;

/**
 * @auther zh
 * @data 2019/4/16 12:52
 * 动态规划背包问题
 * 状态方程：
 * 假设物品个数为n，背包承载容量为W，物品价值为g[],物品重量为p[]
 * F(n,W) = 0           n<=1 && W < p[0]
 * F(n,W) = g[0]        n == 1 && W >= p[0]
 * F(n,W) = F(n-1,W)    n > 1 && W <p[n-1]
 * F(n,W) = max(F(n-1,W),F(n-1,W-p[n-1])+g[n-1])    n > 1 && W >= p[n-1]
 */
public class Practice9 {

    public static void main(String[] args) {
        int knapsackMaxWeight = 5;

        int profit []= {200,240,140,150};

        int weight []= {1,3,2,5};
        System.out.println(maxValue(4,5,profit,weight));
    }
    public static int maxValue(int n,int W, int[] g,int[] p){
        int[] preRes = new int[W+1];
        int[] result = new int[W+1];

        for (int i = 0; i <= W; i++) {
            if (i < p[0]){
                preRes[i] = 0;
            }else {
                preRes[i] = g[0];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= W; j++) {
                if (j < p[i]){
                    result[j] = preRes[j];
                }else {
                    result[j] = Math.max(preRes[j],preRes[j-p[i]]+g[i]);
                }
            }
            preRes = result;
        }
        return result[W];
    }
}
