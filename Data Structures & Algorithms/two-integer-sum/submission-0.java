class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        ArrayList<Integer> dynAns = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                dynAns.add(map.get(complement));
                dynAns.add(i);

            } 
            map.put(nums[i],i);
            
        }
        int[] ans = new int[2];
        for(int i = 0;i<2;i++){
            ans[i] = dynAns.get(i);
        }
        return ans;
    }
}
