import java.util.Arrays;
import java.util.HashMap;
/**
 * @author Dyson
 * @date 2019/3/15 18:23
 */
public class isAnagram {
    public static void main(String[] args) {
        System.out.println(isAnargramTwo("abcd","cbad"));
    }
    //使用数组，统计字符串中每个字符出现的个数
    public static boolean isAnagramOne(String s, String t) {
        int []a=new int[26];
        int []b=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            b[t.charAt(i)-'a']++;
        }
        return Arrays.equals(a,b);
    }
    //将字符串中的数组进行排序，然后在进行比较
    public static boolean isAnargramTwo(String s, String t){
        char []chars1=s.toCharArray();
        char [] chars2=t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return String.valueOf(chars1).equals(String.valueOf(chars2));
    }
}
