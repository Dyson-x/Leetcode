class Solution {
    public int firstUniqChar(String s) {
        String tmp=s;
        char []data=tmp.toCharArray();
        if(data.length==1){
            return 0;
        }
        if(data.length==0){
            return -1;
        }
        for(int i=0;i<data.length;i++){
            char a=tmp.charAt(i);
            //当该字符串从前往后和从后往前找返回的下标一致时，证明该字符为字符串中唯一字符
            if(tmp.indexOf(a)==tmp.lastIndexOf(a)){
                return i;
            }
        }
        return -1;
    }
}
