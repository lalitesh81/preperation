class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums[nums.length-1];
        for(int i=0;i<n;i++){
            if(i != nums[i])
                return i;
                
        }
        return n+1;
    }
}