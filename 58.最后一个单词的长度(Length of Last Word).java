class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        //ʹ��trim�������ַ������ҿո�ȥ��
        String str=s.trim();
        int len=str.length();
        //��󵥴ʳ��ȵķ���ֵ
        int num=0;
        for(int i=len-1;i>=0;i--){
            //�Ӻ���ǰ���бȽϣ�ֱ�������ո�����ѭ��
            if(str.charAt(i)!=' '){
                ++num;
            }else{
                break;
            }
        }
        return num;
    }
}
