import java.util.HashMap;

/**
 * @author Dyson
 * @date 2019/3/16 22:09
 */
//无重复字符的最长子串
public class lengthOfLongestSubstring_3 {
    public static void main(String[] args) {
        System.out.println(test("ababab"));
    }
    public static int test(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        //flag记录的是无重复子串的起始位置，ret为最长无重复子串长度
        //由于HashMap的Key是不允许重复的，所以每当有重复的字符存到map中去就会更新Kay所对应的value
        //HashMap是以Key-Value进行存储的，插入与查找的时间复杂度都是O(1)的，而底层数据结构是红黑树+数组——链表实现的
        int flag = -1, ret = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //如果前面字符串中出现重复且出现的位置在flag所记录的范围之中，则更新flag
            if (hashMap.containsKey(c) && hashMap.get(c) >= flag) {
                //更新flag
                flag = hashMap.get(c);
            }
            hashMap.put(c, i);
            //取最大的无重复串长度
            ret = Math.max(ret, i - flag);
        }
        return ret;
    }
}
