class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        
        for(int i = 0; i < n -2; i++){
            if (nums[i] > 0)
                break;

          if (i == 0 || nums[i] != nums[i - 1]) {
            int low = i+1, high = n-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum < 0 ) {
                    low++;
                }
                else if(sum > 0 ) 
                {
                    high--;
                }
                else {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;
                }
            }
        }
    }
    return result;
}
}
