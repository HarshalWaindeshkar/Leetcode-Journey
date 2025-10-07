class twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        twosum sol = new twosum();

        // Input array and target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the method
        int[] res = sol.twoSum(nums, target);

        // Print output
        System.out.println("Indices: " + res[0] + ", " + res[1]);
    }
}

//Leetcode solution
 /*class Solution {
    public int[] twoSum(int[] nums, int target){
    int [] arr=new int[2];
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
                break;
            }
        }
    }
    return arr;
    }
}*/
