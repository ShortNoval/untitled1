public class leetcode11 {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,res=0;
        while (i<j){
            res=height[i]<height[j]?Math.max(res,(j-i)*height[i++]):Math.max(res,(j-i)*height[j--]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] hi={1,8,6,2,5,4,8,3,7};
        leetcode11 test1=new leetcode11();
        int ans1=test1.maxArea(hi);
        System.out.println(ans1);
    }
}
