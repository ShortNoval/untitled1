public class leetcode724 {
    public int pivotIndex(int[] nums) {
        int [] left=new int[nums.length];
        left[0]=0;
        int [] right=new int[nums.length];
        right[nums.length-1]=0;
        for(int i=1;i< nums.length;i++){
            left[i]=nums[i-1]+left[i-1];
        }
        for (int j=nums.length-2;j>=0;j--){
            right[j]=right[j+1]+nums[j+1];
        }
        for (int i=0;i<nums.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums1={1,7,3,6,5,6};
        leetcode724 test =new leetcode724();
        int ans=test.pivotIndex(nums1);
        System.out.println(ans);

    }
}
