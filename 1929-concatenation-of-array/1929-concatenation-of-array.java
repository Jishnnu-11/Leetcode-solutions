class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] res= new int[n];
        int[] arr = new int[n+n];
        for(int i=0;i<n;i++){
            res[i] =nums[i];

        }
        System.arraycopy(nums,0,arr,0,n);
        System.arraycopy(res,0,arr,n,n);

    return arr;   
    }
}