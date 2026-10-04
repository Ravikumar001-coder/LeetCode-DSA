class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closest = nums[0];
        int sum = Integer.MIN_VALUE;
        for( int i = 0; i < n-2; i++){
            
            int newTarget = target-nums[i];
            int s = i+1;
            int e = n-1;
            
            while(s<e){
                sum = nums[s] + nums[e];
                if(sum >= newTarget){
                    e--;
                }else{
                    s++;
                }
            }
            if(sum + nums[i] >= target && closest >= sum + nums[i]){
                closest = sum + nums[i];
            }else if(nums[i] + sum >= closest){
                closest = sum + nums[i];
            }

        }
        return closest;
    }
}