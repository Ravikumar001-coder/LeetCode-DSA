class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length-1;
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<n-1; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -nums[i];
            List<Integer> twoSum = new ArrayList<>();
            int s = i+1;
            int e = n;
            while(s<e){
                int sum = nums[s] + nums[e];
                if(sum == target){

                    triplets.add(Arrays.asList(nums[i], nums[s], nums[e]));
                    while (s < e && nums[s] == nums[s + 1]) s++;
                    while (s < e && nums[e] == nums[e - 1]) e--;
                    s++;
                    e--;
                    
                }
                else if(sum < target){
                    s++;
                }else {
                    e--;
                }
            }
        }
        
    return triplets;
    }
}