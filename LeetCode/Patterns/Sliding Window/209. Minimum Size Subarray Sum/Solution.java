class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int l = 0;
        for( int h = 0; h<n; h++){
            sum  = sum + nums[h];

            while(sum>= target){
                ans = Math.min(ans, h-l +1);
                sum = sum - nums[l];
                l++;
            }
        }
        
        return ans == Integer.MAX_VALUE ? 0 : ans;  
    }
}