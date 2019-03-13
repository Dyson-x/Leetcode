class KthLargest {
    static Queue<Integer> q;
    static int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        q=new PriorityQueue<>();
        for(int i:nums){
            add(i);
        }
    }
    public int add(int val) {
        if(q.size()<k){
            q.add(val);
        }else{
            if(val>q.peek()){
                q.poll();
                q.offer(val);
            }
        }
        return q.peek();
    }
}
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */