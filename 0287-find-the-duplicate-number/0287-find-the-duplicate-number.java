class Solution {
    public int findDuplicate(int[] arr) {

        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]) {
                    swap(arr,i,correct);
                }else {
                    return arr[correct];
                }
            } else {
                i++;
            }
        }
        return -1;
    }    
    
    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}