//�ܴ�ܴ�ķ���  LeetCodeսʤ5%�ķ���
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

//��˧�ķ��� LeetCodeսʤ99.79%�ķ���
class Solution {
    public int strStr(String haystack, String needle) {
        //���Ϊ��ֱ�ӷ���0
        if(needle.equals("")){
            return 0;
        }
        //���haystack����С��needleֱ�ӷ���-1
        if(haystack.length()>=needle.length()){
            for(int i=0;i<haystack.length();i++){
                //�жϵ�һ���ַ��Ƿ����
                if(haystack.charAt(i)==needle.charAt(0)){
                    //����iλ�ÿ�ʼhaystack����ĳ���С��needleֱ�ӷ���-1
                    if(haystack.substring(i).length()<needle.length()){
                        return -1;
                    }
                    //����iλ�ÿ�ʼhaystack��needle��ȣ�ֱ�ӷ���i
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
