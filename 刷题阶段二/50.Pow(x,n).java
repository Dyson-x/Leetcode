class Solution {
    public double myPow(double x, int n) {
        // if(n == 0) {             
        //     return 1;       
        // }    
        // double half = myPow(x, n / 2);     
        // //2的整数倍则只需要与自身相乘    
        // if(n % 2 == 0) {         
        //     return half * half;  
        // }
        // //奇数需要额外乘以x
        // else if(n > 0){        
        //     return half * half * x;   
        // }
        // //负数返回其倒数 
        // else {           
        //     return half * half * (1 / x);    
        //}
        
        
        
        // double res=1.0;
        // //判断有多少位
        // for(int i=n;i!=0;i/=2){
        //     //判断当前位是否为1,
        //     if((i&1)!=0){
        //         res*=x;
        //     }
        //     //不断累乘
        //     x*=x;
        // }
        // //如果为负数取倒数
        // return n>0?res:1/res;
    }
}