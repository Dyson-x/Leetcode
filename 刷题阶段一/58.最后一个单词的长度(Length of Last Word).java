class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        //使用trim方法将字符串左右空格去掉
        String str=s.trim();
        int len=str.length();
        //最后单词长度的返回值
        int num=0;
        for(int i=len-1;i>=0;i--){
            //从后往前进行比较，直到遇到空格跳出循环
            if(str.charAt(i)!=' '){
                ++num;
            }else{
                break;
            }
        }
        return num;
    }
}
