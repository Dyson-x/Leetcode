排序后取中位数
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

摩尔投票法：这是一种先假设候选者，然后再进行验证的算法。
我们现将数组中的第一个数假设为众数，然后进行统计其出现的次数，如果遇到同样
的数，则计数器自增1，否则计数器自减1，如果计数器减到了0，则更换下一个数字
为候选者。这是一个很巧妙的设定，也是本算法的精髓所在，为啥遇到不同的要计数
器减1呢，为啥减到0了又要更换候选者呢？首先是有那个强大的前提存在，一定会有
一个出现超过半数的数字存在，那么如果计数器减到0了话，说明目前不是候选者数
字的个数已经跟候选者的出现个数相同了，那么这个候选者已经很weak，不一定能
出现超过半数，我们选择更换当前的候选者。那有可能你会有疑问，那万一后面又大
量的出现了之前的候选者怎么办，不需要担心，如果之前的候选者在后面大量出现的
话，其又会重新变为候选者，直到最终验证成为正确的众数，佩服算法的提出者啊！

class Solution {
    public int majorityElement(int[] nums) {
        int ret=0,num=0;
        for(int tmp:nums){
            if(num==0){
                ret=tmp;
                num++;
            }else {
                if(tmp==ret){
                    num++;
                }else{
                    num--;
                }
            }
        }
        return ret;
    }
}