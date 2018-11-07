class Solution {
    public boolean isPalindrome(String s) {
        //当字符串为空或者只有一个字符时，返回true
        if(s.length()==0||s.length()==1){
            return true;
        }
        //将字符串中的字母全部变成大写字母
        String str=s.toUpperCase();
        int i=0,j=str.length()-1;
        while(i<j){
            //寻找字符串中左边的数字字符或字母
            while(i<j&&!isNumOr(str.charAt(i))){
                i++;
            }
            //寻找字符串右边的数字字符或字母
            while(i<j&&!isNumOr(str.charAt(j))){
                j--;
            }
            //若左右字符不相等时，返回false
            if((i<j)&&(str.charAt(i)!=str.charAt(j))){
                return false;
            }      
            i++;
            j--;
        }
        return true;
    }
    //判断该字符是否是数字字符或字母
    boolean isNumOr(char c){
        if(c>='A'&&c<='Z'){
            return true;
        }else if(c>='0'&&c<='9'){
            return true;
        }
        return false;
    }
}