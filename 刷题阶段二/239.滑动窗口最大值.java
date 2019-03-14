import java.util.*;
/**
 * @author Dyson
 * @date 2019/3/14 8:23
 */
public class maxSlidingWindow_239 {
    public static void main(String[] args) {
        int[]nums = {1,3,-1,-3,5,3,6,7};
        int []rec=maxSlidingWindowWayOne(nums,3);
        for(int i:rec){
            System.out.print(i+" ");
        }
    }
    //版本一
    public static int[] maxSlidingWindowWayOne(int[] nums,int k){
        if(nums==null||k<1||k>nums.length)
            return new int[0];
        int[] a=new int[nums.length-k+1];
        ArrayList<Integer> ret=new ArrayList<>();
        LinkedList<Integer> deque=new LinkedList<>();
        for(int i=0;i<k-1;i++){
            while(!deque.isEmpty()&&nums[i]>nums[deque.getLast()])
                deque.removeLast();
            deque.addLast(i);
        }
        for(int i=k-1;i<nums.length;i++){
            while(!deque.isEmpty()&&nums[i]>nums[deque.getLast()])
                deque.removeLast();
            deque.addLast(i);
            if(i-deque.getFirst()+1>k)
                deque.removeFirst();
            a[i+1-k]=nums[deque.getFirst()];
        }
        return a;
    }
    //使用双端队列，时间复杂度为O(n)
    //java中的双端队列deque（支持在两端插入和移除元素）,deque是一个接口
    // 实现它的类有ArrayDeque，LinkedBlockingDeque,LinkedList.
    public static int[] maxSlidingWindowWayTwo(int[] nums,int k){
        if(nums==null||k<1||k>nums.length)
            return new int[0];
        int[] a=new int[nums.length-k+1];
        LinkedList<Integer> deque=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            while(!deque.isEmpty()&&nums[i]>nums[deque.getLast()])
                deque.removeLast();
            deque.addLast(i);
            if(i-deque.getFirst()+1>k)
                deque.removeFirst();
            if(i+1>=k)
                a[i+1-k]=nums[deque.getFirst()];
        }
        return a;
    }
    //使用优先队列,时间复杂度为O(nlogk)
    public static int[] maxSlidingWindowWayThree(int[] nums,int k){
        if(nums==null||k<1||k>nums.length)
            return new int[0];
        int[] a=new int[nums.length-k+1];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            //当队列中已经源头k个数时，需要将第一个元素移除，才能放置后边的元素
            if(i>k){
                pq.remove(nums[i-k]);
            }
            //添加元素
            pq.offer(nums[i]);
            //获取当前堆顶元素
            if (i + k - 1 >= k) {
                a[i-k+1]=pq.peek();
            }
        }
        return a;
    }
}
