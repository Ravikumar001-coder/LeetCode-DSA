class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        
        // Initialize with the first valid triplet sum to avoid MAX_VALUE edge cases
        int closest = nums[0] + nums[1] + nums[2]; 
        
        for (int i = 0; i < n - 2; i++) {
            int s = i + 1;
            int e = n - 1;
            
            while (s < e) {
                int currentSum = nums[i] + nums[s] + nums[e];
                
                // If the current sum is closer to the target, update closest
                if (Math.abs(currentSum - target) < Math.abs(closest - target)) {
                    closest = currentSum;
                }
                
                // Move pointers to try and get closer to the target
                if (currentSum < target) {
                    s++; // We need a larger sum
                } else if (currentSum > target) {
                    e--; // We need a smaller sum
                } else {
                    // If currentSum == target, distance is 0. You can't get closer than this.
                    return currentSum; 
                }
            }
        }
        
        return closest;
    }
}