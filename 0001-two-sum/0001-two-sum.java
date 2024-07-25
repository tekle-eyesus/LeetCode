class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res={0,1};
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            for(;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    // System.out.println("["+ i+","+j);
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }

}