սʤ100%���ύ��¼
class Solution {
    public int maxSubArray(int[] nums) {
        int frist,second,max;
        max=frist=nums[0];
        for(int i=1;i<nums.length;i++){
            second=(nums[i]+frist>nums[i]?nums[i]+frist:nums[i]);
            if(max<second){
                max=second;
            }
            frist=second;
        }
        return max;
    }
}
 
սʤ50%���ύ��¼
class Solution {
    public int maxSubArray(int[] nums) {
        int[] cur=new int[2];
        cur[0]=nums[0];
        int max=cur[0];
        for(int i=1;i<nums.length;i++){
            //����cur[1]��ֵ
            if(nums[i]+cur[0]>nums[i]){
                cur[1]=nums[i]+cur[0];
            }else{
                cur[1]=nums[i];
            }
            //maxʼ�ձ����������������
            if(max<cur[1]){
                max=cur[1];
            }
            //����cur[0]��ֵ
            cur[0]=cur[1];
        }
        //�����������������֮��
        return max;
    }
}
