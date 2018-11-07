class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ret=new int[2];
        int i=0,j=0;
        for(;i<nums.length;i++){
            int sum=nums[i];
            j=0;
            for(;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if((i!=j)&&(sum==target)){
                    ret[0]=i;
                    ret[1]=j;
                    break;
                }
            }
        }
        return ret;
    }
}