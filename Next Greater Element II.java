class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        Arrays.fill(a, -1);
        
        Stack<Integer> s = new Stack();
        for(int i = 0; i < n*2; i++) {
            while(!s.isEmpty() && nums[s.peek()] < nums[i % n]) {
                a[s.pop()] = nums[i % n];
            }
            if(i < n) s.push(i);
        }
        return a;
    }
}
