//很挫很挫的方法  LeetCode战胜5%的方法
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        } 
        char[] hay=haystack.toCharArray();
        char[] nee=needle.toCharArray();
        int len1=hay.length,len2=nee.length;
        int i=0,j=0;
        for(;i<len1;i++){
            int num=0;
            if(hay[i]==nee[0]){
                int k=i;
                for(j=0;j<len2&&k<len1;j++,k++){
                    if(hay[k]!=nee[j])
                        break; 
                    ++num;
                }
            }
            if(num==len2){
                return i;
            }
        }
        return -1;
    }
}

//很帅的方法 LeetCode战胜99.79%的方法
class Solution {
    public int strStr(String haystack, String needle) {
        //如果为空直接返回0
        if(needle.equals("")){
            return 0;
        }
        //如果haystack长度小于needle直接返回-1
        if(haystack.length()>=needle.length()){
            for(int i=0;i<haystack.length();i++){
                //判断第一个字符是否相等
                if(haystack.charAt(i)==needle.charAt(0)){
                    //若从i位置开始haystack往后的长度小于needle直接返回-1
                    if(haystack.substring(i).length()<needle.length()){
                        return -1;
                    }
                    //若从i位置开始haystack与needle相等，直接返回i
                    if(haystack.substring(i,needle.length()+i).equals(needle)){
                        return i;
                    }
                }
            }
            return -1;
        }
        return -1;
    }
}
