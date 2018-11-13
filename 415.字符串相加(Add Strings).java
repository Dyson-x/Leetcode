class Solution {
    public String addStrings(String Num1, String Num2) {
        //���ַ���ת��Ϊ����
        char []num1=Num1.toCharArray();
        char []num2=Num2.toCharArray();
        int n=num1.length;
        int m=num2.length;
        int i=n-1,j=m-1,key=0;
        //str��ʾҪ���ص��ַ���
        StringBuilder str=new StringBuilder();
        while(i>=0||j>=0){
            int a=i>=0?num1[i--]-'0':0;
            int b=j>=0?num2[j--]-'0':0;
            int sum=key+a+b;
            //ÿ�ζ����µ�λ��ӵ��ַ������ʼ
            str.insert(0,sum%10);
            key=sum/10;
        }
        //�������ַ����ϲ�
        if(key==1){
            str.insert(0,1);
        }
        //��StringBuilderת��ΪString
        return str.toString();
    }
}

