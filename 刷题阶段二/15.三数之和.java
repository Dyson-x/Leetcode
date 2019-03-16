import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author Dyson
 * @date 2019/3/16 23:00
 */
public class threeSum_15 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            //如果后面的数和前面的数相同，则不再进行查找，起到去重效果
            if (i >= 1 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int s = nums[i] + nums[l] + nums[r];
                if (s < 0) {
                    l += 1;
                } else if (s > 0) {
                    r -= 1;
                } else {
                    lists.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1])
                        l += 1;
                    while (l < r && nums[r] == nums[r - 1])
                        r -= 1;
                    l += 1;r -= 1;
                }
            }
        }
        return lists;
    }
}
