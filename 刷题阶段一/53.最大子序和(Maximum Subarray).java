战胜100%的提交记录
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
 
战胜50%的提交记录
class Solution {
    public int maxSubArray(int[] nums) {
        int[] cur=new int[2];
        cur[0]=nums[0];
        int max=cur[0];
        for(int i=1;i<nums.length;i++){
            //更新cur[1]数值
            if(nums[i]+cur[0]>nums[i]){
                cur[1]=nums[i]+cur[0];
            }else{
                cur[1]=nums[i];
            }
            //max始终保持最大连续子数组
            if(max<cur[1]){
                max=cur[1];
            }
            //更新cur[0]数值
            cur[0]=cur[1];
        }
        //返回最大连续子序列之和
        return max;
    }
}
