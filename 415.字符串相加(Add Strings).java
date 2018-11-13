class Solution {
    public String addStrings(String Num1, String Num2) {
        //将字符串转变为数组
        char []num1=Num1.toCharArray();
        char []num2=Num2.toCharArray();
        int n=num1.length;
        int m=num2.length;
        int i=n-1,j=m-1,key=0;
        //str表示要返回的字符串
        StringBuilder str=new StringBuilder();
        while(i>=0||j>=0){
            int a=i>=0?num1[i--]-'0':0;
            int b=j>=0?num2[j--]-'0':0;
            int sum=key+a+b;
            //每次都将新的位添加到字符串的最开始
            str.insert(0,sum%10);
            key=sum/10;
        }
        //将两个字符串合并
        if(key==1){
            str.insert(0,1);
        }
        //将StringBuilder转化为String
        return str.toString();
    }
}

