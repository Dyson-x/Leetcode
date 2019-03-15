package com.company.day3_16;

/**
 * @author Dyson
 * @date 2019/3/15 19:41
 */
/*
1  0  1
2  00 01 10 11
3  000 001 010 011 100 101 110 111
 */
//生成格雷码
public class GrayCode {
    public static void main(String[] args) {
        String[] result = test(4);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
    //0  1  00  01  11  10  000 001 011 010    100 101 111 110     110 111 101 100
    //方法一：递归
    // 递归的思路就是n位gray码是由n-1位gray码生成，举个例子简单一些：
    // 比如求n=3的gray码，首先知道n=2的gray码是(00,01,11,10)
    // 那么n=3的gray码其实就是对n=2的gray码首位添加0或1生成的，添加0后变成(000,001,011,010)
    // 添加1后需要顺序反向就变成(110,111,101,100)
    // 组合在一起就是(000,001,011,010,110,111,101,100)
    public static String[] test(int n) {
        String[] retstrs = null;
        if (n == 1) {
            retstrs = new String[]{"0", "1"};
        } else {
            String[] str = test(n - 1);
            retstrs = new String[2 * str.length];
            for (int i = 0; i < str.length; i++) {
                retstrs[i] = "0" + str[i];
                retstrs[retstrs.length-i-1] = "1" + str[i];
            }
        }
        return retstrs;
    }
}
