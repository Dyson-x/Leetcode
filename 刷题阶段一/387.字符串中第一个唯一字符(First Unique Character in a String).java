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
            //�����ַ�����ǰ����ʹӺ���ǰ�ҷ��ص��±�һ��ʱ��֤�����ַ�Ϊ�ַ�����Ψһ�ַ�
            if(tmp.indexOf(a)==tmp.lastIndexOf(a)){
                return i;
            }
        }
        return -1;
    }
}
