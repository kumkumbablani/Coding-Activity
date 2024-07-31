class Solution {
    public int[] findErrorNums(int[] nums) {
         int i = 0;
         while(i < nums.length){
            int index = nums[i] - 1;
            if (nums[i] != nums[index]){
               swap(nums , i , index);
            }
            else{
                i++;
            }
        }
        
        
         for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
               return new int[] {nums[index] , index+1};
            }
        }
        
        return new int[] {-1 , -1};
    }
    
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}