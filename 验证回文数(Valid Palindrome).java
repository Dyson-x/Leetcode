class Solution {
    public boolean isPalindrome(String s) {
        //���ַ���Ϊ�ջ���ֻ��һ���ַ�ʱ������true
        if(s.length()==0||s.length()==1){
            return true;
        }
        //���ַ����е���ĸȫ����ɴ�д��ĸ
        String str=s.toUpperCase();
        int i=0,j=str.length()-1;
        while(i<j){
            //Ѱ���ַ�������ߵ������ַ�����ĸ
            while(i<j&&!isNumOr(str.charAt(i))){
                i++;
            }
            //Ѱ���ַ����ұߵ������ַ�����ĸ
            while(i<j&&!isNumOr(str.charAt(j))){
                j--;
            }
            //�������ַ������ʱ������false
            if((i<j)&&(str.charAt(i)!=str.charAt(j))){
                return false;
            }      
            i++;
            j--;
        }
        return true;
    }
    //�жϸ��ַ��Ƿ��������ַ�����ĸ
    boolean isNumOr(char c){
        if(c>='A'&&c<='Z'){
            return true;
        }else if(c>='0'&&c<='9'){
            return true;
        }
        return false;
    }
}