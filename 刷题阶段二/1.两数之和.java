/*
 *使用Map求解
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            //记录target与当前数组元素差值
            int tmp = target - nums[i];
            //在map里寻找是否存在对应的差值
            if (map.containsKey(tmp)) {
                //返回元素下标
                return new int[]{map.get(tmp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}